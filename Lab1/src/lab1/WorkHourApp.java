package lab1;
import java.util.Scanner;
public class WorkHourApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int hoursperday;
System.out.println("Please input the number of hours you work a day: ");
hoursperday = input.nextInt();
int numdays;
System.out.println("Please input the number of days you work: ");
numdays = input.nextInt();
for(int count = 1; count <=numdays; count++) {
	int result = count * hoursperday;
	System.out.println("Total Hours worked = " +result);
}
}
}
