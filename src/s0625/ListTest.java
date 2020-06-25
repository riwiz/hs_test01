package s0625;

import java.util.ArrayList;
import java.util.List;

class Animal	{
	public void run()	{
		System.out.println("동물이 달립니다.");
	}
}

class Dog extends Animal	{
	public void back()	{
		System.out.println("강아지가 짖습니다.");
	}
	
}

public class ListTest {
	public static void main(String[] args)	{
		List<Animal> aniList = new ArrayList<>();
		aniList.add(new Animal());
		aniList.add(new Dog());
		
		for(int i=0;i<aniList.size(); i++) {
			Animal a = aniList.get(i);
			a.run();
			if(a instanceof Dog)	{ // 개라고 불러도 될까?
				Dog d = (Dog) a;
				d.back();
			}
		}
		
	}

}
