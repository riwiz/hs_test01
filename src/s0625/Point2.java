package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {

	
	
	public static void main(String[] args)	{
		int numMin=0;
		int numMax=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 몇명?  : " );
		int cnt = Integer.parseInt(scan.nextLine());
		List<Integer> pList = new ArrayList<>();
		for(int i=0; i<cnt; i++)	{
			System.out.print(i+ "번째 학생 점수는? : ");
			
			pList.add(Integer.parseInt(scan.nextLine()));
			
		}
		
	
		
		for(int i=0;i<pList.size();i++ )	{
			if(i==0 || numMin>pList.get(i))	{
				numMin = pList.get(i);
				
			}if(numMax<pList.get(i))	{
				numMax = pList.get(i);
				
			}
			
			
		}
		
		System.out.println(pList);
		System.out.print("최소값 : "+ numMin );
		System.out.println("최대값 : "+numMax);
	}
	

}
