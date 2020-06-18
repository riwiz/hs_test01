package s0618_2;

public class Execute {

	
	public static void main (String[] args)	{
		
	//	Action a; // 인터페이스는 데이터 타입으로 쓸수 있음
		Action a = new Animal(); // 같은 패키지에서 import 없이 쓸수 있음.
		a.hug();
		a.cry();
	}
}
