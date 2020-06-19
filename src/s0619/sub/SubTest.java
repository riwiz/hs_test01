package s0619.sub;

public class SubTest {
	
	public int num1; // 어디에서나
	protected int num2; //상속을 받으면 접근가능
	int num3; // 같은 패키지에서 접근가능
	private int num4; // SubTest만 접근가능(나만!) - 메인메소드 이하에서도 접근 불가
	

}
