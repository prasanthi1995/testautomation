package inherDemo;

public class CanadaBank implements Bank

{
	public void TotalBalance()
	{
		System.out.println("TotalBalance of CanadaBank");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new CanadaBank();
		b1.CustomerDetails();

	}



	@Override
	public void TotalBranches()
	{
		System.out.println("TotalBalance of CanadaBank");
		
		
		
	}



	@Override
	public void CustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("CustomerDetails of CanadaBank");
		
	}

}
