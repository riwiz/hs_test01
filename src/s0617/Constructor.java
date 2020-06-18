package s0617;

public class Constructor {
	
	int a =1;
	
	Constructor()	{
		System.out.println("1234");
	} //1.데이터 타입이 없다. 2.클래스명과 대소문자 동일 3. 자동으로 컴파일시 생성(정의시는 자동으로 만들어주지 않음)
	
	public static void main(String[] args)	{
		
			Constructor c;
			c = new Constructor(); // 생성[메모리에 만들어짐]시 호출
			System.out.println(c);
	}
	
}
