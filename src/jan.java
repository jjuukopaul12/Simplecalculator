import java.util.Scanner;
//Make sure u import the Scanner
public class jan {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	cinab cinabObject = new cinab();
	//prompt on the Screen 
	System.out.println("Enter the Name of Your Girl Friend Here: ");

	String seth=input.nextLine();
	cinabObject.SetName(seth);
	// We need to use our object in another class which is janvier
	//Here you girl friend will be the Name entered
	cinabObject.janvier();
	}
	

}
