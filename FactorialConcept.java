package JavaProgram;

public class FactorialConcept {
	
	public static int Factorial(int num) {
		
		int fact =1;
		
		 if(num ==0) 
			 return 1;
		 
	
			 for(int i =1;i<=num;i++) {
			 fact= fact*i;
			 }
		 
		 return fact;
				 
	}
	
		 public static int Simple(int num) {
		 if(num==0)
			 return 1;
		 
		 else
			 return (num*Simple(num-1));
		 }

	public static void main(String[] args) {
		System.out.println(Factorial(4));
		System.out.println(Simple(10));
	
	}

}
