package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args)	{
		List<String> strList = new ArrayList<>(); // ArrayList = strList 라 부를수 있음 (구현-LIST인터페이스) /순서대로 입출력 빠름
		strList.add("선생님 천재");											//LinkedList
		strList.add("너 나와");
		strList.add("하하하!");
		int idx =	strList.indexOf("너나와");
		System.out.println(idx);
		
		
		
	}
}
