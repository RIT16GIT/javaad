package OOPS;

public class StaticandNonstatic {
	
	
	 String name ="Ram";//non-static global variable
	 static int age = 30;//static global variable

	public static void main(String[] args) {
	           
		
		//calling static method
        sum();
        
        StaticandNonstatic.sum();//calling by classname
        System.out.println(age);//calling static variable
        System.out.println(StaticandNonstatic.age);//calling by classname
        
        //calling nonstatic method
        StaticandNonstatic obj = new StaticandNonstatic();
        obj.sendmail();
		System.out.println(obj.name); 
        
		//we can call static method by obj reference not proper
		obj.sum();//warning call in static way
		
	}

	public void sendmail() {//non-static method
		System.out.println("Send mail");
	}
	
	public static void sum() {//static method
		System.out.println("sum method");
	}
	
	
}
