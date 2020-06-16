package s0616;

public class Test14 {

	//데이터 타입 + 메소드명 + 자기영역
	static void a(int a,int b)	{
		a=3;
	}
	
	static int num1()	{
		return 1;
	}
	
		static int num2()	{
		return 2;
	}
	
	public static void main (String[] args)	{
		
		
		int a = num1();
		System.out.println(a);
		System.out.println(num1());
		
		a(0,0);
		
		
		
	}
}
