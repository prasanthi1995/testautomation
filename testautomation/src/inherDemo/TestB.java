package inherDemo;

public class TestB extends TestA
{
	int i=30;

	public static void main(String[] args) {
		TestA t1=new TestB();
		System.out.println(t1.i);
		

	}

}
