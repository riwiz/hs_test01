package s0619;

public class ArrayTest3 {

	public static void main(String[] args)	{
		int nums[] = new int[40];
		for (int j=0; j<nums.length;j++)	{
			nums[j] = (j+1)*2;
			System.out.println("nums["+j+"]" +nums[j]);
		}
		
	}
}
