package s0617;

public class LoopTest {
	
	
	public static void main (String[] args)	{
		
		// if()	{ } // 구조 동일
		
		for(int i = 1 ;i<10 ;i++ )	{ //실행순서 1. 선언부, 2, 조건부, 3 실행, 4.증감부,5조건부 / 반복
			// System.out.print("no." + i + " : " );
			
			if(i%2==0)	{
				System.out.println(i); //짝수만 출력
			}
			
			
			//System.out.println("난 멈추지 않지!"); // for( ; ; ) { } 구조만 갖추면 실행됨. 시작과 끝이 명확할때 사용
		}
		
		
		
		
	}

}
