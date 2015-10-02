//Instance variable
//Multiple method
//Kevin Janvier
public class cinab{
	//make a new variable
	//private only  method inside the class ca use it
	private String girlName;
	//set name of variable a use entered into girlname
	public void SetName(String name){
		//girl name equal to name
		girlName=name;
	}
	//Method is going to return something
	//if is not going to return anything i could just put void
	public String getName(){
		//return girl Name which is up online 10
		return girlName;
	}
//Let us make one last method 
	public void janvier(){
		// printf is new type : what is does it take %s where is taking strings
	System.out.printf("You first Girl Friend Was %s", getName());
	}
}
