package s0623;

public class Person {
	
	private String name;
	private int age;

	public Person()	{
		this.age = (int)(Math.random()*30+1);
	}
	private String address;
	
	public String toString()	{
		return "name: "+name +"    age: "+age+"    address :"+address;
	}
		
	public String getName()	{
		return name;
	}
	public int getAge()	{
		return age;
	}
	public String getAddress()	{
		return address;
	}
	
	public void setName(String name)	{
		this.name = name;
	}
	
	public void setAge(int age)	{
		this.age = age;
	}
	
	public void setAddress(String address)	{
		this.address = address;
	}
	
	

	
	
	
	
	
}
