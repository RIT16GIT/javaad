package OOPS;

public class CallbyreferenceCallbyvalue {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyreferenceCallbyvalue obj = new CallbyreferenceCallbyvalue();
		 int x = 10;
		 int y = 20;
		 obj.Sum(x,y);//call by value or pass by value		
         
		 obj.p=70;
		 obj.q=80;
		 
		 obj.swap(obj);
		 System.out.println(obj.p);
		 System.out.println(obj.q);
		 
	}

	public int Sum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	 }
	
	public void swap(CallbyreferenceCallbyvalue t){
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}
	
}
