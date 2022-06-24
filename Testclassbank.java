package OOPSconceptpart2;

public class Testclassbank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
	
		HSBCbank b = new HSBCbank();
		 b.credit();
		 b.debit();
		 b.transfermoney();
		 b.educationloan();
		 b.carloan();
		 
		 USBank u =new HSBCbank();
		 u.credit();
		 u.debit();
		 u.transfermoney();

	}

}
