import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlockbusterTests {

    @Test
    void testVHS() {
        //Check constructor functionality
        VHS vhs = new VHS("title", "category", 90, new ArrayList<String>(Arrays.asList("a","b","c")));
        String expectedTitle = "title";
        String expectedCategory = "category";
        int expectedRuntime = 90;
        assertEquals(vhs.getTitle(), expectedTitle);
        assertEquals(vhs.getCategory(), expectedCategory);
        assertEquals(vhs.getRuntime(), expectedRuntime);

        //Check play function increments runtime
        assertEquals(vhs.getCurrentTime(), 0);
        vhs.play();
        assertEquals(vhs.getCurrentTime(), 1);

        //Check rewind direct call functionality
        vhs.rewind();
        assertEquals(vhs.getCurrentTime(), 0);

        //Check automatic rewind functionality
        for (int i = 0; i < vhs.getScenes().size() + 1; i++) {
            vhs.play();
        }
        assertEquals(vhs.getCurrentTime(), 0);
    }

    @Test
    void testDVD() {
        //Check constructor functionality
        DVD dvd = new DVD("title", "category", 90, new ArrayList<String>(Arrays.asList("a","b","c")));
        String expectedTitle = "title";
        int expectedRuntime = 90;
        assertEquals(dvd.getTitle(), expectedTitle);
        assertEquals(dvd.getRuntime(), expectedRuntime);
    }

}