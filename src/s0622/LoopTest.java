package s0622;

public class LoopTest {

	
	public static void main(String[] args)	{
		
		//짝수 만 더하기 홀수만 더하기
		
		int r = 0;
		int h = 0;
		int x = 0;
		
		for(int i =1;i<=1000;i++)	{ if(i%2 == 0)	{ //홀수값 구하기 i%2==1; i%2 !=0;
			h +=i;
		} else {
			x +=i; }
		
			}
		
		
		System.out.println(h);
		System.out.println(x);
	}
}
