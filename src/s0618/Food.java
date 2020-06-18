package s0618;



class JokBal extends Food{
	
}
class DonKass extends Food{
	
}
class DuckBBoki extends Food{
	
}

public class Food extends Object{ //extends Object 생략됨

	public static void main(String[] args)	{
		
		
		Food f = new Food();
		f = new JokBal();
		f = new DonKass();
		f = new DuckBBoki();
		
		DonKass d = (DonKass) f;
		
	}
	
}
