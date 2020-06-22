package s0622;

import java.util.Random;

public class IfTest {
	
	public static void main(String[] args)	{
		// 연산자 and(&&)or(||)
//		int num1 = 1;
//		int num2 = 10;
//		int num3 = 20;
//		
//		if(num1>1 || num2<20 && num3 ==21)	{ // 헷갈림 해볼것 문제 냄
//			System.out.println("대충 니생각 맞아~");
			  
			// ------------------------------------------
			
			
			
//1보다 작거나 20클때.
//20보다 크고 1보다 작을때
			
		for (int x = 1;x<=10000;x++) {
			double d = Math.random();
			int num = (int) (d*20)+1;
			if(num<1 || num>20) {
				System.out.println("이상함");
							
			} 
				
			
		} System.out.println("완료");
			
		}
	}

