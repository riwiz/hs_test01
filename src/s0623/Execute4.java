package s0623;

public class Execute4 {

	public static void main (String[] args)	{
		
		Person p = new Person();
		p.setName("김해성");
		p.setAge(40);
		p.setAddress("서울 중랑구");
		
		System.out.println(p);
		
		p = new Person();
		System.out.println(p);
		
	}
	
}
