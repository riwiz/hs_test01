package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
	public static void main(String[] args)	{
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		p.setName("박민수"); //박민수 출력
		
		p = new Person(); // 초기화 후 박민수 나옴
		p.setName("최민수"); //박민수 출력
		System.out.println(p);
		System.out.println(pList.get(0));
		
		
		
		
	}

}
