package s0624;

public class StringArray3 { // 짝수일 경우만 배열에 숫자로 입력
	public static void main(String[] args)	{
		String str = "1,3,2131,23,12,32,45,16,87,93";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length]; //짝수 갯수 찾아서 배열에 복사할것
		
		for(int i=0;i<strs.length; i++) {
			
			
			nums[i] = Integer.parseInt(strs[i]);
			
			if((nums[i])%2==1) {
				nums[i] = 0;
			}
			}
		

		
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		
	}
}
