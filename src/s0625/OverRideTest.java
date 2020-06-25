package s0625;

class Test	{
	public void run()	{
		System.out.println("달려달려");
	}
	public String toString()	{
		return "달려가자" ;
	}
	
}

class SubTest extends Test	{
	public void feed()	{
		System.out.println("밥먹자!!");
	}

	public String toString()	{
		return "걸어가자" ;
	}	
}

public class OverRideTest {

		public static void main(String[] args) {
			Test t = new SubTest();
			t.toString();
			Test t1 = new Test();
			t1.toString();
		} 
		
		
		
		
	

}