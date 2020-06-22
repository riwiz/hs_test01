package s0622;

public class ArrayTest2 {

	public static void main (String[] args)	{
		
		int[][] nums = new int[3] [3];
		// nums[0] = new int[4];
	
		int num = 1;
		
		
		for(int i=0; i<nums.length; i++)	{
			for(int j=0;j<3; j++)	{
				nums[i][j] = (i*nums.length)+1+j;
//				nums[i][j] = num++;
				
			}
		}
		
		
		
		for(int i=0;i<nums.length; i++)	{
			for(int j=0;j<3;j++)	{
				System.out.printf("naums[%d][%d]=%d%n",i,j,nums[i][j]);
			}
		}
		
		
	}
	
	
}
