package s0623;
//배열로 만들것
public class Cat {

	private String name;
	private int age;
	
	public String getName()	{
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
	
	public String toString()	{
		return "name :" +name + " age :" +age;
	}
	
}
