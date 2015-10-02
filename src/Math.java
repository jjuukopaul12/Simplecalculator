import java.util.Scanner;

public class Math{

	public static void main (String args[]){

		Scanner janv = new Scanner (System.in);
		int boys, girls, people;
		boys=13;
		girls=12;
		//Here we add all Math Operator but when we reach on modules %
		// Is giving us a reminder ..
		//Question:
		//How to calculate a reminder in of two numbers in Java 
		//Programming
		people = boys % girls;
		System.out.println(people);


	}

}