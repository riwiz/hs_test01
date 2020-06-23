package s0623;

import java.util.Random;


public class Lotto {

	

	public static void main(String[] args)	{
	
		int[] nums = new int[6];
		Random r = new Random();
		for(int i=0; i<nums.length; i++)	{
			nums[i] = r.nextInt(6+1);
//			for(int x=i-1;x>=0 ;x--)	{
//				if(nums[x]==nums[i])	{
//					i--;
//				}
//			}
			
						
			
			for(int x =1;x<nums.length;x++) {
				
			if(i<0 && nums[i-1] == nums[x] && i<nums.length)	{
			i--;
//			nums[i] = r.nextInt(45+1); // 중복값 발생
			}
		}
			
			
		}
		for(int i=0; i<nums.length; i++)	{
			
			System.out.println((i+1)+"번째 :" + nums[i]);
		}
		
		
	}
}
