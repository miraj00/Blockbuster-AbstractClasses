import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MovieApp {

		public static final Movie THE_BEGINNING = new DVD("Shaktiman", "Animated",80, new ArrayList<>(Arrays.asList(
		            "The ballonman seen on the street",
		            "The flemingo bird is seen from far",
		            "Car comes to pick up kids",
		            "The Devil comes to fight Shaktiman",
		            "The movie ends when Shaktiman wins"
				)));	
		
		 public static final Movie KGF = new DVD("KGF_Chapter_1", "Documentary", 180, new ArrayList<>(Arrays.asList(
		            "The boy turns 20 years old",
		            "The armed men search for the culprit of damages",
		            "When boys fights back the armed men, people finds spaces to hide",
		            "The chittah comes to rescue the little boy",
		            "The boy uses his horse to compete in race"
				)));
		
		 public static final Movie JURRASIC_PARK = new DVD("Jurassic Park", "Documentary", 180, new ArrayList<>(Arrays.asList(
		            "The group of kids come to visit the park",
		            "The rangers try to save kids from dinosaurs ",
		            "Few kids gets lost in the forest",
		            "The search ends with kids returning to main camp",
		            "The Helicoptor arrives and all leaves the forest safely"
				)));	
		 
		 public static final Movie DOOMS_DAY = new VHS("The Dooms Day", "Sci-fi", 142, new ArrayList<>(Arrays.asList(
		            "Earth quakes are recorded in smaller scales",
		            "Scientists start to collect more data",
		            "People in the city starts migration to higher ground",
		            "The flooding near coastal area damages local area",
		            "Tsunami creates havoc in the whole city area"
		    )));

		  public static final Movie PLAYERS = new VHS("The Players", "Action", 200, new ArrayList<>(Arrays.asList(
		            "Thieves plan to steal gold from moving train",
		            "The plan gets executed",
		            "The cops search every corner of the city",
		            "Thieves fly to different country to escape",
		            "Police starts looking for thieves in other continents"
		    )));
		 
		    public static final Movie THE_GURU = new VHS("Guru : the untold story", "Action", 200, new ArrayList<>(Arrays.asList(
		            "A kid run away from family and goes to city",
		            "He starts working at an early age",
		            "He struggles as he grows and invests all his income to loan people",
		            "As time goes, he gets higeher returns from people he lent money to",
		            "His encomes turns in millions of dollars per year"
		    )));		 
		
		    
		    public static final ArrayList<Movie> MOVIES = new ArrayList<>(Arrays.asList(
		            THE_BEGINNING, 
		            KGF, 
		            JURRASIC_PARK, 
		            DOOMS_DAY, 
		            PLAYERS, 
		            THE_GURU
		       ));		    
		    
		    public static void main(String[] args) {		    

		        boolean takeInput = true;
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Welcome to GC Blockbuster!");

		        String s = "";
		        while (takeInput) {
		            // Displays each movie
		            System.out.println("Please Select a Movie from the list:");
		     
		            for (int i = 0; i < MOVIES.size(); i++) {
		                Movie movie = MOVIES.get(i);
		                // We're using i + 1 so it displays as 1-X instead of 0-X
		                System.out.printf("\t %d) %s %n", i + 1, movie.getTitle());
		            }
		            
		            // Ask for movie index
		            s = scanner.nextLine();
		            int index = getInt(s);
		            
		            // Select movie
		            if (index != -1) {
		                Movie movie = MOVIES.get(index);
		                // Display movie information and ask user for confirmation to play
		                movie.printInfo();
		                System.out.println("Do you want to watch the movie? Y/N");
		                s = scanner.nextLine();
		                if (s.toLowerCase(Locale.ROOT).startsWith("y")) {
		                    movie.play();
//		                    takeInput = false;
		                    takeInput = true;
		                	}
		                }
		            else   // if (!s.toLowerCase(Locale.ROOT).startsWith("y"))  
		            	{
	                	takeInput = false;
	                	System.out.println("Goodbye!");
	                	break;
		            }
		            
		        }
		        System.out.println("Goodbye!");
		        scanner.close();
		    }		    

		    
		    public static int getInt(String s) {
		        return Integer.parseInt(0 + s.replaceAll("\\D+","")) - 1;
		    }	    
		    
		    
/*		
		// add getter/setter for scenes

		// This in MovieApp
		List<Movie> movies = new ArrayList<>();
		Movie movie;
		movie = new Movie("The End is a new Beginning", 80);
		movie.getScenes().add("Scene 1 : The ballonman seen on the street");
		movie.getScenes().add("Scene 2 : The flemingo bird watching from far");
		movie.getScenes().add("Scene 3 : Car comes to pick up kids ");
		movies.add(movie);
		movie = new Movie("KGF", 180);
		movie.getScenes().add("Scene 1 : The boy turns 20 years ");
		movie.getScenes().add("Scene 2 : The armed men search for culprit for damages");
		movie.getScenes().add("Scene 3 : The ");
		movies.add(movie);
		movie = new Movie("Jurassic Park", 110);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Thor", 120);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("The Life of a Pie", 90);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
		movie = new Movie("Freedom", 60);
		movie.getScenes().add("Scene 1");
		movie.getScenes().add("Scene 2");
		movie.getScenes().add("Scene 3");
		movies.add(movie);
*/		
		
		
		
	
}
