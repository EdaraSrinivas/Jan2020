package pack1;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean binary;		// variable declaration
		
		binary = false;	// initialization
		
		
		// To store the WholeNumbers
		
		byte b = 127;
		
		System.out.println("Min Value:"+Byte.MIN_VALUE+" -- Max Value:"+Byte.MAX_VALUE);
		
		short sh = 456;
		
		System.out.println("Min Value:"+Short.MIN_VALUE+" -- Max Value:"+Short.MAX_VALUE);
		
		int in = 2456543;
		
		System.out.println("Min Value:"+Integer.MIN_VALUE+" -- Max Value:"+Integer.MAX_VALUE);
		
		
		long lon = 5353596646L;
		
		System.out.println("Min Value:"+Long.MIN_VALUE+" -- Max Value:"+Long.MAX_VALUE);
		
		
		// To Store the Decimal Numbers
		
		double d = 45.23;
		
		System.out.println("Min Value:"+Double.MIN_VALUE+" -- Max Value:"+Double.MAX_VALUE);
		
		float f = 56.23F;
		
		System.out.println("Min Value:"+Float.MIN_VALUE+" -- Max Value:"+Float.MAX_VALUE);
		
		
		// To store character ( Single Alphabet, or digit,  or Special Character)
		
		char c = 'a';
		
		char c1 = '5';
		
		char c2 = '*';
		
		
		// Derived DataType
		
		int ar[]  = new int[3];
		
		ar[0] = 34;
		ar[1] = 45;
		ar[2] = 56;
	//	ar[3] = 76;
	//	ar[4] = 12;
		
		System.out.println(ar.length);
		
		int br[] = {12,45,23,78,12,89};
		
		System.out.println(br.length);
		
		
		String str = "sri@123";
		String str1 = "123";
		
		
	}

}
