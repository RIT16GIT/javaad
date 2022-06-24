package OOPSconceptpart2;

public class TestClass {

	public static void main(String[] args) {
	
		BMW b = new BMW();
		 b.start();
		 b.stop();
		 b.safety();
		 b.engine();
		 
		System.out.println(":::::");
		
		Car c =new Car();//only parent class will excute
		  c.start();
		  c.stop();
         
		  System.out.println("-----");
		  
		  Car c1 = new BMW();
		   c1.start();//child will first called
		   c1.stop();//parent will called as stop method is not declared in bmw
		   
	}
	
	

}
