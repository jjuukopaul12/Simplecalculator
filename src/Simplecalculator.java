import java.util.Scanner;
public class Simplecalculator {
	
	public static void main (String args[])
	{
		Scanner  calculator = new Scanner(System.in);
		int fnum, snum, answer;
		System.out.println("Enter First number: ");
		fnum = (int)calculator.nextDouble();
		System.out.println("Enter Second Number: ");
		snum = (int)calculator.nextDouble();
		answer = fnum + snum;
		System.out.println (answer);
	}
	
	

}
