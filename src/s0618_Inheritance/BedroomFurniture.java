package s0618_Inheritance;

public class BedroomFurniture extends Furniture {

	int money= 888888;
	
	
	BedroomFurniture() {
		System.out.println("난 침실가구");
	}
	
	String name = "침실가구";
	
	public static void main(String[] args) {
		
		Furniture f = new Furniture();
		BedroomFurniture bf = new BedroomFurniture();
		
		
		System.out.println(f);
		System.out.println(f.money);
		System.out.println(f.name);
		System.out.println(bf.money);
		System.out.println(bf.name);
		System.out.println();
	}
}
