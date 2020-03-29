package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List li = new ArrayList();
		
		li.add("sri");
		li.add("ram");
		li.add(34);
		
	//	String str = li.get(0)+li.get(1);
		
		
		String str = ((String)li.get(0))+((String)li.get(1));
		
		
		// Generics-- 1.5
		
		List<String> list = new ArrayList<String>();
		
		list.add("sri");
		list.add("ram");
		list.add("ramu");
		list.add("ss");
		list.add("sri");
		list.add("34");
		list.add("");
		list.add("");
		
		for(String e : list) {
			System.out.println(e);
		}
		
		System.out.println("=====================================");
		Set<Object> s = new HashSet<Object>();
		
		s.add("sri");
		s.add(34);
		s.add("ram");
		s.add(34.12);
		s.add('r');
		s.add("sri");
		s.add("");
		s.add("");
		s.add("hi");
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s);
		}
	
	}
}
