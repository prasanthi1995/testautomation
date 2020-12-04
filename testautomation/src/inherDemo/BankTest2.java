package inherDemo;

public class BankTest2 
{
	Bank b1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTest2 b1=new BankTest2();
		b1.testbalance("Us");
		

	}
	void testbalance(String bankname)
	{
		if(bankname.equals("Us"))
		{
			b1=new UsBank();
			b1.TotalBalance();
		}
		else if(bankname.equals("UK"))
		{
			b1=new UkBank();
		}
		else if(bankname.equals("CanadaBank"))
		{
			b1=new CanadaBank();
		}
	}

}
