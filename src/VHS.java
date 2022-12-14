import java.util.ArrayList;

/*
 *Next Create a child class of Movie called VHS and code the following:
A field called currentTime which will start at 0 and match up with the indexes of the arraylist of scenes 
An override of play() that "plays" (prints out) the scene at the current time and then increments currentTime. 
If currentTime is greater than the max index of the array list, call rewind()
A method called rewind() that returns nothing and sets currentTime to 0. 
 
 */



public class VHS extends Movie {

	public int currentTime = 0;
	
	
	public int getCurrentTime() {			// getter
		return currentTime;
	}


	public VHS(String title, String category, int runTime, ArrayList<String> scenes) {		//constructor
		super(title, category, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		  if (currentTime < getScenes().size()) {
	            System.out.printf("Scene %d: %s%n", currentTime + 1, getScenes().get(currentTime));
	            currentTime++;
	        } else if (currentTime >= getScenes().size()) {
	            rewind();
	        }
		
	}
	
	private void rewind() {
		this.currentTime = 0;
	}
	


	
}
