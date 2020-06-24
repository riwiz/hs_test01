package s0624;

import java.util.ArrayList;
import java.util.List;

class Person	{
	private String name;
	private int age;
	
	public String getName()	{
		return name;
	}
	
	public int getAge()	{
		return age;
	}
	
	public void setName(String name)	{
		this.name = name;
	}
	
	public void setAge(int age)	{
		this.age = age;
	}
	
	public String toString()	{
		return "Person 이름 :" +name+"   " + "나이 : "+age;
	}
	
}

public class ListTest3 {
	public static void main(String[] args)	{
		List<Person> pList = new ArrayList<>();
		
		//Person p = new Person();
		
		//Person p = pList.get(1);
		
		pList.add(new Person());
		pList.add(new Person());
		
		//1. 0,1,2방에 사람 3명이 들어가 있음, 1번방있는사람을 끄집어내서 거기에 여러분의 이름과 나이를 입력 후 출력
		
		//Person p = new Person();
				
		pList.get(1).setName("김해성");
		pList.get(1).setAge(40);
		
		System.out.println(pList.get(1));
		
		
		
	}
}
