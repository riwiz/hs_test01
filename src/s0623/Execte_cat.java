package s0623;

public class Execte_cat {

	public static void main (String[] args)	{
		
		Cat[] cats = new Cat[20]; // cats 배열이름 cats[0] != cat[0]
		
		
		for(int i = 0;i<cats.length; i++)	{
			cats[i] = new Cat();
			cats[i].setName("고양이"+i);
			cats[i].setAge((int)((Math.random()*12)+1));
		}
	
		for(Cat cat:cats) {
			System.out.println(cat); //향상된 for문
		}
		
		
//		for(int i=0;i<cats.length;i++)	{
//			System.out.println(cats[i]);
//		}
		
		
//		cats[0].setName("보리");
//		cats[0].setAge(10);
//		
//		System.out.println(cats[0]);
//		
		//cats[0] = new Cat(); // 메모리 생성후 넣기 가능
		
		
		
		
		
		
	}
	
}
