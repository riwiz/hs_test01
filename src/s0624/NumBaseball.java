package s0624;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {
	
	Random r = new Random();
	int rNum = r.nextInt(10);
	Scanner s = new Scanner(System.in);
	System.out.print("맞춰볼텐가~~~! : ");
	String numStr = s.nextLine();
			
	while(!numStr.equals(rNum+""))	{ // String 또는 int로 비교 / 배열로 야구 게임 만들수있음
		
		System.out.print("틀렸어 다시!! : ");
		numStr = s.nextLine();
	}
	
	System.out.printf("rNum=%d, 니대답=%s",rNum,numStr);
	
	}
}
