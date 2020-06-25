package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		
		
		
		for(int i =0;i<5;i++) {
			Student s = new Student();
			s.setName("이름"+i);
			int point = r.nextInt(101);
			s.setPoint(point);
			stList.add(s);
		}


	int max =0;
	int min =0;
	String maxName="";
	String minName="";
	
	for(int i=0; i<stList.size(); i++)	{
		if(i==0)	{
			min = stList.get(i).getPoint();
			max = stList.get(i).getPoint();
			minName = stList.get(i).getName();
			maxName = stList.get(i).getName();
		}
		
		if(min>stList.get(i).getPoint())	{
			min = stList.get(i).getPoint();
			minName = stList.get(i).getName();
		}
		
		if(max<stList.get(i).getPoint())	{
			max = stList.get(i).getPoint();
			maxName = stList.get(i).getName();
		}
			
//			for(int i=0;i<stList.size();i++)	{
//				if(i==0 || minNum > stList.get(i).getPoint()	{
//					
//				}
//			}
			
			
	}	
		System.out.println(stList);
		
		System.out.println(minName+"   " + min);
		System.out.println(maxName+"   " + max);
	}

}
