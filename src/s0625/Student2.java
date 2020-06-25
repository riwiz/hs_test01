package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student2 {


		public static void main(String[] args) {
			List<Student> stList = new ArrayList<>();
			Random r = new Random();
			
			
			
			for(int i =0;i<5;i++) {
				Student s = new Student();
				s.setName("이름"+i);
				int point = r.nextInt(101);
				s.setPoint(point);
				stList.add(s);
			}

			Student maxStudent =null;
			Student minStudent =null;

		for(int i=0; i<stList.size(); i++)	{
			Student st = stList.get(i);
			if(i==0 || minStudent.getPoint()>st.getPoint())	{
				minStudent =st;
			}
			
			if(i==0 || maxStudent.getPoint()<st.getPoint())	{
				maxStudent =st;
			}
			
				
		}	
			System.out.println(stList);
			
			System.out.println(minStudent);
			System.out.println(maxStudent);
		}
		}
