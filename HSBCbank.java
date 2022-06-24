package OOPSconceptpart2;

public class HSBCbank implements USBank , Brazilbnk {
	
	//overridden from USBank
	public void credit(){
		System.out.println("HSBC....credit");
	}

	public void debit(){
		System.out.println("HSBC.....debit");
	}
	
	public void transfermoney(){
		System.out.println("HSBC.....transfermoney");
		
	}
	
	//seperate  method of hsbc bank
	 
	public void educationloan() {
		System.out.println("HSBC....educationloan");
	}
	
	public void carloan() {
		System.out.println("HSBC....carloan");
	}
	
	//overridden method of brazilbank
	public void mutualfund() {
		System.out.println("brazilbnk....mutualfund");
	}
}

