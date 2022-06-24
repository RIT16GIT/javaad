package OOPS;

public class functions {

	public static void main(String[] args) {
		
		functions obj = new functions();
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String f = obj.qa();
		System.out.println(f);
		
		int h = obj.divison(30,10);
		System.out.println(h);

	}

	//nonstatic method
	
	public void test(){//no input no ouput
	    System.out.println("test method");
}
	public int pqr(){//no input some output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
 
	public String qa(){
		System.out.println("qa");
		String s ="Selenium testing";
		return s;
	}
	
	public int divison (int x,int y){//input parameter
		System.out.println("divison method");
		int d = x/y;
		return d;
	}
}
