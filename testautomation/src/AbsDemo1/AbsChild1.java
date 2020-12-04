package AbsDemo1;

public class AbsChild1 extends AbsDemo1
{
	AbsChild1()
	{
		System.out.println("cons of AbsChild1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsChild1 a1=new AbsChild1();
		a1.funC();
		

	}

	@Override
	void funA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void funB() {
		// TODO Auto-generated method stub
		
	}

}
