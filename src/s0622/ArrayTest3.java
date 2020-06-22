package s0622;

public class ArrayTest3 {

	public static void main(String[] args)	{
		
		int[][][] nums = new int [5] [3] [5];
		
		for(int i =0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++)	{
				
				for (int x=0; x<nums[i][j].length; x++)	{
					nums [i][j][x]	= (i*nums.length*nums[i].length*nums[i][j].length)+1+j+x;
					
				}	
			}
		}
		
		
		
		
		for(int i =0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++)	{
				for (int x=0; x<nums[j].length; x++)	{
				System.out.printf("nums[%d][%d][%d]=%d%n",i,j,x,nums[i][j][x]);
			}
		}
		}
		
		
		
		
	}
	
}
