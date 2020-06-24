package s0624;

import java.util.ArrayList;
import java.util.List;


public class ListTest {
public static void main(String[] args) {
	

//		Object[] objs = new Object[5]; //실제로 잘 사용하지 않음
//		objs[0]	= 1;
//		objs[0]	= "1";
//		objs[0]	= 1.1F;        
		
		
//		int a = 1;
//		Integer i = a; // rapper class
//		
//		long ln =10000L;
//		Long l =ln;
//		
//		boolean bl = true;
//		Boolean b = bl;
//		
//		char c = 'a';
//		Character ch = c;
	
		
		
//		List<Integer> numList = new ArrayList<>();
//		System.out.println(numList.size());
//		numList.add(1);
//		numList.add(1);
//		System.out.println(numList.size());
//		numList.remove(0);
//		System.out.println(numList);
		

	
		List<Integer> numList = new ArrayList<>();			//중복제거 해볼것!
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10)+1;
			if(numList.indexOf(num)!=-1)	{
				i--;
			}else	{
				numList.add(num);
			}
			
				
		}
		
		for(int i = 0; i<10; i++)	{
			System.out.println(i+"공간"+numList.get(i));
		}
	
	
//	List<String> strList = new ArrayList<>();
//	strList.add("경훈");
//	strList.add("원준");
//	strList.add("상영");
//	System.out.println(strList.indexOf("원준이")); //결과값 -1
		
	
	}

}
