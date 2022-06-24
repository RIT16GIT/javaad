package OOPS;

public class Wrapperclass {

	public static void main(String[] args) {
		String i ="100";
		System.out.println(i+20);
		
		//Integer,Double,Boolean
		
		//conversion string to integer
		int h = Integer.parseInt(i);
		System.out.println(h+20);
		
		//conversion string to double
		String x = "12.33";
		double m = Double.parseDouble(x);
		System.out.println(m);
		
		//conversion string to boolean
		String w ="true";
		boolean a = Boolean.parseBoolean(w);
		System.out.println(a);
		
		//conversion int to string
		
		int z =200;
		System.out.println(z+20);
		
		String j = String.valueOf(z);
		System.out.println(j+20);
		
		//char to string
		char u ='r';
		String b =String.valueOf(u);
		System.out.println(b);
		

	}

}
