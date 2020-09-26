// Jackson Kehoe 20105920
package assignment1;
import java.util.Random;
import java.util.Scanner;
public class GuessMaster {
	//instance variables
	private int numberOfCandidates;
	private Entity[] entities;
	
	//no argument constructor
	public GuessMaster() {
		this.numberOfCandidates = 0;
		this.entities = new Entity[100];
	}
	//constructor
	public GuessMaster(int numberOfEntities, Entity entity) {
		this.numberOfCandidates = numberOfEntities; 		//setting number of candidates equal to number of entities
		this.entities[this.numberOfCandidates] = entity; 	//setting entity as part of index numberOfCandidates
	}
	//Mutator
	public void addEntity(Entity entity) {
		this.numberOfCandidates += 1; 						//incrementing amount of index by 1
		this.entities[this.numberOfCandidates] = entity; 	//entity to end of entities array
	}
	//Accessor
	public Entity getEntity(int entityInd) {
		return (this.entities[entityInd]);
	}
	
	//random number for index of play()
	public int genRandomEntityInd() {
		Random rand = new Random();								//Random class to get random integers
		int randInd = rand.nextInt(this.numberOfCandidates + 1);//numbers set to be between 0 and numberOfCandidates
		return randInd;
	}
	
	//welcome and instructions for game
    public void printWelcome() {
        System.out.println("Welcome to Guess Master!");
        System.out.println("The rules are, you will be given the name of a person, " +
                "place or thing, and you must guess when they were born or when the place or thing was created.");
        System.out.println("If your guess is incorrect, you will be told whether the date" +
                " is before or after the guess you made.\n");
        System.out.println("You may end the game at anytime by typing 'quit'.");
        System.out.println("Press 'Enter' when you are ready to start.");

        System.out.println("___________________________________________________________________________________________");
        System.out.print("\n");
    }
    //starts the game
    public void start() {
    	Scanner keyboard = new Scanner(System.in); 			//keyboard input to start game
    	keyboard.nextLine();								//waits for enter to be pressed
    }
    //play by guessing for an entity given in inputs of fucntion
    public void play(Entity entity) {
    	String name = entity.getName();						//accessor used to get name of entity
    	Date birthDate = entity.getBorn();					//accesor used to get birthDate
    	Date guess = new Date();							//new Date created to store guess
    	
    	this.printWelcome();								//prints welcome
    	this.start();										//waits for enter to be pressed
    	System.out.println("When was " + name + " born?");	
    	while(true) {										//loop until proper date is guessed
    		guess.readInput();								//reads keyboard input
    		if(guess.equals(birthDate)) {					//if guess is correct
    			System.out.println("BINGO, You got it!");
    			String entityBorn = entity.toString(name, birthDate);	//toString used to show correct birthDate
    			System.out.println(entityBorn);
    			break;										//exit loop because player has won
    		}
    		else if(guess.precedes(birthDate)) {			//if guess is before birthDate
    			System.out.println("Incorrect. Try a later date");
    		}
    		else {											//guess is after birthDate
    			System.out.println("Incorrect. Try an earlier date");
    		}
    	}
    }
    //play guessing for entity in specific index given in function index
    public void play(int entityInd) {
        Entity entity = this.getEntity(entityInd);              //get the entity that is in the given index
        String name = entity.getName();                         //accessor to get name
        Date birthDate = entity.getBorn();                      //accesor to get birthDate
        Date guess = new Date();                                //stores the guess

        this.printWelcome();                                      //prints welcome
        this.start(); 											  //waits for enter to be pressed
        System.out.println("When was " + name + " born?");	
    	while(true) {										//loop until proper date is guessed
    		guess.readInput();								//reads keyboard input
    		if(guess.equals(birthDate)) {					//if guess is correct
    			System.out.println("BINGO, You got it!");
    			String entityBorn = entity.toString(name, birthDate);	//toString used to show correct birthDate
    			System.out.println(entityBorn);
    			break;										//exit loop because player has won
    		}
    		else if(guess.precedes(birthDate)) {			//if guess is before birthDate
    			System.out.println("Incorrect. Try a later date");
    		}
    		else {											//guess is after birthDate
    			System.out.println("Incorrect. Try an earlier date");
    		}
    	}
    }

	//no argument declaration of play using random generated index
    public void play() {
    	int randInd = genRandomEntityInd();
    	Entity entity = this.getEntity(randInd);			//used to generate random index
    	String name = entity.getName();						//get entity that is at index of entities[]
    	Date birthDate = entity.getBorn();					//accesors to get birthDate
    	Date guess = new Date();							//stores the guess
    	
    	this.printWelcome();								//prints welcome
    	this.start();										//waits for enter to be pressed
    	System.out.println("When was " + name + " born?");	
    	while(true) {										//loop until proper date is guessed
    		guess.readInput();								//reads keyboard input
    		if(guess.equals(birthDate)) {					//if guess is correct
    			System.out.println("BINGO, You got it!");
    			String entityBorn = entity.toString(name, birthDate);	//toString used to show correct birthDate
    			System.out.println(entityBorn);
    			break;										//exit loop because player has won
    		}
    		else if(guess.precedes(birthDate)) {			//if guess is before birthDate
    			System.out.println("Incorrect. Try a later date");
    		}
    		else {											//guess is after birthDate
    			System.out.println("Incorrect. Try an earlier date");
    		}
    	}
    }
    public static void main(String[] args) {
    	Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
    	Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
    	Entity usa = new Entity("United States", new Date("July", 4, 1776));
    	GuessMaster gm = new GuessMaster();
    	gm.addEntity(trudeau);
    	gm.addEntity(dion);
    	gm.addEntity(usa);
    	
    	gm.play();
    	
    }
}
	
