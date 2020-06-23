package s0623;

public class Dog {
	private String name;
	private int age; //일반적으로 접근을 허락하지 않음
	
	public String toString()	{
		return "name : " +name + " age : " +age;
	}
	
	public String getName()	{ //getset메소드
		return name;
	}
	
	public int getAge()	{
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age)	{
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
