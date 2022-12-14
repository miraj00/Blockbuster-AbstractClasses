import java.util.ArrayList;
import java.util.List;


public abstract class Movie {

	public String title;
	public int runTime;				// in minutes
	public ArrayList <String> scenes;
	public String category;
	
	
	public String getTitle() {					// getter
		return title;
	}

//	public void setTitle(String title) {		// setter
//		this.title = title;
//	}

	public Integer getRunTime() {				// getter
		return runTime;
	}

//	public void setRunTime(Integer runTime) {	// setter
//		this.runTime = runTime;
//	}
	
		
	public String getCategory() {				// getter
		return category;
	}

//	public void setCategory(String category) {	// setter
//		this.category = category;
//	}

    public ArrayList<String> getScenes() {		// getter
        return scenes;
    }
		
//	public void setScenes(ArrayList<String> scenes) {	// setter
//		this.scenes = scenes;
//	}

	public Movie(String title, String category, int runTime, ArrayList<String> scenes) {		// constructor
	super();
	this.title = title;
	this.category = category;
	this.runTime = runTime;
	this.scenes = scenes;
	
}
	
	public void printInfo() {
		System.out.println(" Title : " + getTitle() + "  runTime : " + getRunTime() + " minutes");
	}	
	

	public void printScenes() {
		for (int i=0; i< scenes.size(); i++) {
			System.out.println(i + ") " + scenes.indexOf(i));
		}
	}
	
	public abstract void play();

	
	
	

	
	
	
	
}
