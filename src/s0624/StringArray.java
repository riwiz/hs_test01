package s0624;

public class StringArray {
	
	public static void main(String[] args)	{
		
//		중복제거 / 하드코딩 원리
//		String lottoNums = "10,21,5,19,41,17";
//		int idx = lottoNums.indexOf(","); // 예약어에 대한 리턴값을 생각할것 (변수에 대입)
//		System.out.println(idx);
//		String num1 = lottoNums.substring(0,idx);
//		nums[cnt++] = Integer.parseInt(num1);
//		lottoNums = lottoNums.substring(idx+1);
//		System.out.println(lottoNums);
//		idx = lottoNums.indexOf(",");
//		String num2 = lottoNums.substring(0,idx);
//		System.out.println(num2);
//		lottoNums = lottoNums.substring(idx+1);
//		System.out.println(lottoNums);
		
		
		String lottoNums = "10,21,5,19,41,17";
		
		
			int[] nums = new int[6];
			int cnt = 0;
			
			while(lottoNums.indexOf(",")!=-1)	{
				int idx = lottoNums.indexOf(",");
				String num1 = lottoNums.substring(0,idx);
				nums[cnt++] = Integer.parseInt(num1);
				lottoNums = lottoNums.substring(idx+1);
			}
			if(!"".equals(lottoNums))	{
				nums[cnt] = Integer.parseInt(lottoNums);
			}
			
			
			for(int num : nums)	{
				System.out.println(num);
			}
			
		
		
		
		
	}

}
