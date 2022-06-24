package OOPS;

public class Methodoverloading {

	public static void main(String[] args) {
		
		Methodoverloading obj = new Methodoverloading();
		        obj.sum();
		        obj.sum(10);
		        obj.sum(2,3);
		

	}

	// sum method is method overloading ,we use same method with different input parameter or argument
	//within same class
	public void sum() {//zero parameter
		System.out.println("sum method zero parameter");
	}
	
	public void sum(int i) {//one inpout parameter
		System.out.println("sum method one parameter");
		System.out.println(i);
	}
	
	public void sum (int k,int h) {// two input parameter
		System.out.println("sum method two parameter");
		System.out.println(k+h);
	}
}

