package s0623;

public class StaticTest {
	static String str; // static 인경우 초기화해줌 해당클래스에 있는 별도라는 인식할것!
	int num;
	
	public static void main(String[] args)	{
		System.out.println(str); // str 필드변수 static 이라서 사용가능   
		str = "123";
		StaticTest st = new StaticTest();
		
		
		StaticTest st2 = new StaticTest();
		System.out.println(st.str);
		System.out.println(st2.num);
		
	}
	
	

}
