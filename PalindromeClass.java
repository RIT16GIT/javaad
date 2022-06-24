package JavaProgram;

public class PalindromeClass {
	
	
	public static void IsPalindrome(int num) {
		
		int r=0;
		int sum=0;
		int t ;
		
		 t = num;
		 
		 while(num>0) {
			 r = num % 10;
			 sum = (sum*10)+ r;
			 num = num/10;
		 }
		
		 if (t==sum){
			 System.out.println("IsPalindrome");
		 }
			 
		 else { 
			System.out.println("IsnotPalindrome");
		 }
	}

	public static void main(String[] args) {
		IsPalindrome(121);
		IsPalindrome(456);

	}

}
