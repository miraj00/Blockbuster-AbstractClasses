import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
 * Create a child of Movie named DVD with the following code: 
An override play() that takes no parameters, is void, and
 will ask the user what scene they’d like to watch, 
 print all the available scenes, and 
 allow the user to select a scene from the list and print it out.
 */

public class DVD extends Movie{

	public final String MESSAGE_WHICH_SCENE =  "Which Scene of DVD %s would you like to watch ? Select 1 to %d%n "; 
	public final String MESSAGE_CONTINUE = " Do you want to Watch another Scene? (y/n) : ";
	
	public DVD(String title, String category, int runTime, ArrayList<String> scenes) {
		super(title, category, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		Scanner scanner = new Scanner(System.in);
        boolean takeInput = true;
        String input = "";

        while (takeInput) {
            System.out.printf(MESSAGE_WHICH_SCENE, getTitle(), getScenes().size());
            input = scanner.nextLine();

            int index = MovieApp.getInt(input);
            if (index + 1 <= getScenes().size() && index != -1) {
                System.out.printf("Scene %d: %s%n", index + 1, getScenes().get(index));
                System.out.println(MESSAGE_CONTINUE);
                input = scanner.nextLine();
                if (input.toLowerCase(Locale.ROOT).startsWith("n")) {
                    takeInput = false;
                }
            }
        }

        scanner.close();
    }
}
