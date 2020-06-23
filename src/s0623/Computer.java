package s0623;

public class Computer {

	private String cpu;
	private int ram;
	private String board;
	
	Computer(String cpu, int ram, String board)	{
		this.cpu = cpu;
		this.ram = ram;
		this.board = board;
	}
		void upgrade(String cpu){
			this.cpu =cpu;
		
	}
		void upgrade(String cpu, int ram){
			this.cpu =cpu;
			this.ram =ram;
		
	}
		void upgrade(String cpu, int ram, String board){
			this.cpu =cpu;
			this.ram = ram;
			this.board = board;
		
	}
		
		
		
		
	void printInfo()	{
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram + "G");
		System.out.println("BOARD : " + board);
	}
}
