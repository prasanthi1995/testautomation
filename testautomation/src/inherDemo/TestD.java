package inherDemo;

public class TestD extends TestC
{
	static void funA()
	{
		System.out.println("funA of TestD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestC t1=new TestD();
		t1.funA();

	}

}
