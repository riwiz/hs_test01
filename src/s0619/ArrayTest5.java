package s0619;

public class ArrayTest5 {

	public static void main(String[] args)	{
		 
		
		int[] nums = new int[5];
		
		for(int i =0;i<nums.length;i++)	{
			nums[i] = (i+1)*3;
		}
		
		int[] tmp = nums;
		nums = new int[nums.length+1];
		
		for(int i=0;i<tmp.length;i++)	{
			nums[i] = tmp[i];
		}
		
		for(int i=0;i<nums.length;i++)	{
			System.out.println(nums[i]);
		}
		
	}
	
}
