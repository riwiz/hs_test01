package s0618;

public class Constructor2 {
	
	int[] getNums()	{
		int[] nums = new int[2];
		nums[0] = 1;
		nums[1] = 2;
			return nums;
		}
	   
	public static void main(String[] args) {
	
		
		
	Constructor2 c = new Constructor2();
	System.out.println(c);
	}
	
	
}
