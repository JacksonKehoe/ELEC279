package lab1;
import java.util.Scanner;
public class Lab1Task4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int var;
System.out.println("Input an integer: ");
var = input.nextInt();
for(int i = 0; i <=20; i++) {
	int result = var * i;
	System.out.println(+result);
}
}
}
