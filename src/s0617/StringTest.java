package s0617;

public class StringTest {

	//String str = "1"; // static 사용 비사용 <-메모리 재사용에 관한 내용 설명
	
	static int length(String str)	{
		int cnt = 0;
		for(int i=0; i<str.length(); i++ )	{
			System.out.print(str.charAt(i));
			cnt++;
		}
		
		return cnt;
	}

	public static void main(String[] args)	{
		
			
		
	/*	StringTest st1 = new StringTest(); // static없이 멤버 변수(인스턴스변수) 호출 /   인스턴스화, 인스턴스 변수
		StringTest st2 = new StringTest();
		System.out.println(st1.str); // 
		System.out.println(st1.str==st2.str); // true 출력됨 / 
		
		
		String str = "1";
		System.out.println(st1.str==str); */ 
		
	
		String str = "12345"; // 문자열 캐릭터 배열로 인식
		
		int cnt = length(str);
		System.out.println();
		System.out.println(cnt);
		
		
		
	/*	str.replace("12", "일이"); // <- 실행만
		
		
		System.out.println(str.length());
		System.out.println(str.lastIndexOf("2"));
		System.out.println(str.indexOf("2"));
		
		System.out.println(str.replace("23", "이삼")); // 다른 경우, 정규표현식 사용 ex) 개인정보,채팅 금지어
		
		
		*/
		
	}
	
}
