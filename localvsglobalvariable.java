package OOPS;

public class localvsglobalvariable {

	String name ="Parth";
	int age = 25;
	
	public static void main(String[] args) {
		
		localvsglobalvariable obj =new localvsglobalvariable();
		
		int i = 1;//local var of main method
		System.out.println(i);
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void sum(){

		int i = 20;//local var of sum method
		int j = 40;
	}	

}
