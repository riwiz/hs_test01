package s0618;

public class Dog extends Animal{
	
	public void speak()	{
		super.speak();
		System.out.println("강아지가 짖습니다.");
	}
	

	public static void main (String[] agrs) {
		Dog d = new Dog();
		d.speak();
	}
	
}
