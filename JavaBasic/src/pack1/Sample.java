package pack1;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		int a[] = {22,56,76,23};
		System.out.println(a.length);
		System.out.println(a[3]);
		
		int b[] = new int[3];
		b[0] = 45;
		b[1] = 0;
		b[2] = 12;
		b[3] = 12;
		System.out.println(b[1]);
		
		// limitations
		// fixed size
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.set(0, "sri");
		ar.set(1, "ram");
		ar.set(0, "srinivas");
		ar.set(2, "sri");
		ar.set(3, "sri");
		ar.set(4, "sri");
		ar.set(5, "sri");
		ar.set(6, "sri");
		ar.set(7, "sri");
		ar.set(8, "sri");
		ar.set(9, "sri");
		
		System.out.println(ar.size());
		
		
		
	}

}
