package s0618;

public class Son extends Father{

	Son(){
		System.out.println("난 나중이지!");
	}
	int money = 10000;
	
	public static void main (String[] args)	{
		
		new Son();
		
	//	Son s = new Son();
	//	s.name ="손흥민";
	//	System.out.println(s.name + "돈" + s.money);
		
	//	Father f = new Son();
		//Son s2 = (Son)f;
	//	System.out.println("아빠돈 :" +f.money);
	}
	
}
