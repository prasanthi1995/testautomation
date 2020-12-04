package inherDemo;

public class UsBank implements Bank
{
	public void TotalBalance()
	{
		System.out.println("TotalBalance of Bank");
	}
	public void TotalBranches()
	{
		System.out.println("TotalBrances of Bank");
	}
	public void CustomerDetails()
	{
		System.out.println("CustomerDetails of Bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank b1=new Bank(); for interface we cant create object
		Bank b1=new UsBank();
		b1.TotalBalance();
		b1.TotalBranches();
		
		
		

	}

}
