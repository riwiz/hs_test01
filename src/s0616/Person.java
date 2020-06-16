package s0616;

public class Person {
	String name;
	String address;
	int age;
		
	void run()	{
		System.out.println(name + "이 달립니다."); //this. 생략됌
		if (age>30)	{
			System.out.println(age + "가 되니까 지치는구나..");
					
		}else	{
			System.out.println("쌩쌩하구만!!");
			
		}
	}
	public static void main (String[] args) {
	
		/*	Person p = new Person(); //Person에 대한 메모리 생성
		p.name ="투덜";
		p.age =32;
		p = new Person(); // 이상없이 실행됌 (변수니까)
		p.run();
		
		System.out.println(p.name);
		System.out.println(p.age);	*/
		
		Person[] people = new Person[5];
		Person p = new Person();
		
		people[0] = new Person();
		System.out.println(p.name); // 변수명에 따른 사용 유의
		
	}

}
