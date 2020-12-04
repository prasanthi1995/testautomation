package inherDemo;

public class UkBank implements Bank
{
	public void TotalBalance()
	{
		System.out.println("TotalBalance of ukBank");
	}
	public void TotalBranches()
	{
		System.out.println("TotalBranches of UkBank");
	}
	public void CustomerDetails()
	{
		System.out.println("CustomerDetails of UkBank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new UkBank();
		b1.TotalBalance();
		b1.TotalBranches();

	}

}
