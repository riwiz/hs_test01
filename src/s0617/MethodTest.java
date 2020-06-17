package s0617;

public class MethodTest {

/*	int add()	{
		return 0;	}
	String add(int a)	{
		return "";		} 오버로딩 ex) println */ 

	static int add(int num1, int num2)	{
	return num1 + num2;	
	}
	
	static String add(String str1, String str2)	{
	return str1 + str2;	
	}
	
	public static void main(String[] args)	{
		
		
		int a = add(1,3);
		String b = add("가", "나");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.print(add(2,4));  
		
	/*	int a = add();
		a =add();
		System.out.println("123".indexOf("1"));  */
	}

}
