package lab5;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Date;

public class Lab5 {

	public static void main (String[] args) {
	
	System.out.println("Step 3:");
	System.out.println("");
	
	//creating ArrayList with an initial capacity of 5
	ArrayList<Integer> intArray = new ArrayList<Integer>(5);
	Random rand = new Random(); 
	
	//adding 10 random numbers between 0 and 99 to the ArrayList
	for (int i=0; i<10; i++) {
		int nextVal = rand.nextInt(100);
		intArray.add(nextVal);
	}
	
	//printing ArrayList
	System.out.println("Integer Array:");
	System.out.println(intArray);
	
	//iterating through intArray and adds each element to index 0 in the ArrayList revIntArray
	ArrayList<Integer> revIntArray = new ArrayList<Integer>(intArray.size());
	for (int num : intArray) {
		revIntArray.add(0,num);
	}
	
	//printing reversed ArrayList
	System.out.println("");
	System.out.println("Reversed Integer Array:");
	System.out.println(revIntArray);
	
	//creating an ArrayList of HourlyEmployee objects
	ArrayList<HourlyEmployee> hourlyEmployeeArray = new ArrayList<HourlyEmployee>(100);
	
	//adding object to ArrayList
	HourlyEmployee Tom = new HourlyEmployee("Waluigi",new Date(100,2,3), 15.00, 2.0);
	hourlyEmployeeArray.add(Tom);
	//adding object to hourlyEmployeeArray
	HourlyEmployee John = new HourlyEmployee("Wario",new Date(97,4,15), 16.00, 15.0);
	hourlyEmployeeArray.add(John);
	//adding object to hourlyEmployeeArray
	HourlyEmployee Waluigi = new HourlyEmployee("Luigi",new Date(93,11,9), 30.00, 30.0);
	hourlyEmployeeArray.add(Waluigi);
	//adding object to hourlyEmployeeArray
	HourlyEmployee PercMarselo = new HourlyEmployee("Mario",new Date(87,4,25), 45.00, 40.0);
	hourlyEmployeeArray.add(PercMarselo);
	
	//printing ArrayList
	System.out.println("");
	System.out.println("Hourly Employee Array:");
	System.out.println(hourlyEmployeeArray);
	//printing size of ArrayList
	System.out.println("");
	System.out.print("Size of Hourly Employee Array: ");
	System.out.println(hourlyEmployeeArray.size());
	
	//trimming ArrayList capacity to size
	hourlyEmployeeArray.trimToSize();
	
	//replacing first object in ArrayList with new object
	hourlyEmployeeArray.set(0, new HourlyEmployee("Bowser",new Date(101,1,2), 30.0, 45.0));
	//printing ArrayList
	System.out.println("");
	System.out.println("After changing first element:");
	System.out.println(hourlyEmployeeArray);
	
	//removing third element in ArrayList
	hourlyEmployeeArray.remove(2);
	//printing ArrayList
	System.out.println("");
	System.out.println("After removing third element:");
	System.out.println(hourlyEmployeeArray);
	
	/*----------------------------------------------------------------------------------------*/

	System.out.println("");
	System.out.println("Step 4:");
	System.out.println("");
	
	//creating new Pair object
	Pair<String> couple1 = new Pair<String>("Perc Marselo", "Kimmy Hed");
	//creating new Pair object
	Pair<String> couple2 = new Pair<String>("Mike Hunt", "Jenny Talia");
	//creating new Pair object
	Pair<String> couple3 = new Pair<String>("Mike Hunt", "Jenny Talia");
	
	//printing variables of Pair object
	String strp1 = couple1.toString();
	System.out.println("Couple 1:");
	System.out.println(strp1);
	//printing variables of Pair object
	String strp2 = couple2.toString();
	System.out.println("Couple 2:");
	System.out.println(strp2);
	//printing variables of Pair object
	String strp3 = couple3.toString();
	System.out.println("Couple 3:");
	System.out.println(strp3);
	
	System.out.println("");
	
	//comparing two Pair objects to check if they are the same
	System.out.print("Comparing couple 1 and couple 2: ");
	if(couple1.equals(couple2)) {
		System.out.println("Couples have identical names");
	}
	else {
		System.out.println("Couples do not have identical names");
	}
	
	//comparing two Pair objects to check if they are the same
	System.out.print("Comparing couple 1 and couple 3: ");
	if(couple1.equals(couple3)) {
		System.out.println("Couples have identical names");
	}
	else {
		System.out.println("Couples do not have identical names");
	}
	
	//comparing two Pair objects to check if they are the same
	System.out.print("Comparing couple 2 and couple 3: ");
	if(couple3.equals(couple2)) {
		System.out.println("Couples have identical names");
	}
	else {
		System.out.println("Couples do not have identical names");
	}
	
	System.out.println("");
	
	//creating new Triple object
	Triple<String, Double> trip1 = new Triple<String, Double>("Tokyo", 1738.00, "Toronto");
	//creating new Triple object
	Triple<String, Double> trip2 = new Triple<String, Double>("North Korea", 420.69, "Uganda");
	//creating new Triple object
	Triple<String, Double> trip3 = new Triple<String, Double>("Tokyo", 1738.00, "Toronto");
	
	//printing variables of Triple object
	String strT1 = trip1.toString();
	System.out.println("Trip 1:");
	System.out.println(strT1);
	//printing variables of Triple object
	String strT2 = trip2.toString();
	System.out.println("Trip 2:");
	System.out.println(strT2);
	//printing variables of Triple object
	String strT3 = trip3.toString();
	System.out.println("Trip 3:");
	System.out.println(strT3);
	
	System.out.println("");
	
	//comparing two Triple objects to check if they are the same
	System.out.print("Comparing trip 1 and trip 2: ");
	if(trip1.equals(trip2)) {
		System.out.println("Trips are identical");
	}
	else {
		System.out.println("Trips are not identical");
	}
	
	//comparing two Triple objects to check if they are the same
	System.out.print("Comparing trip 1 and trip 3: ");
	if(trip1.equals(trip3)) {
		System.out.println("Trips are identical");
	}
	else {
		System.out.println("Trips are not identical");
	}
	
	//comparing two Triple objects to check if they are the same
	System.out.print("Comparing trip 2 and trip 3: ");
	if(trip3.equals(trip2)) {
		System.out.println("Trips are identical");
	}
	else {
		System.out.println("Trips are not identical");
	}


	}

}