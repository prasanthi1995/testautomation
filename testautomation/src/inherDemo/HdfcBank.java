package inherDemo;

public class HdfcBank extends RbiBank 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank h1=new HdfcBank();
		h1.cbillscore();

	}
	HdfcBank()
	{
		System.out.println("cons of HdfcBank");
	}
	void cbillscore()
	{
		System.out.println("cbillscore of HdfcBank");
	}

}
