package basic;

public class Narrowing {

	public static void main(String[] args) {
		
		
		//narrowing--> bigger to smaller
		double d= 76.9;
		byte b=(byte) d;
		int i=(int) d;
		float f=(float) d;
		System.out.println(b);
		System.out.println(i);
		System.out.println(f);
		
		//widening--> smaller to bigger
		byte k=8;
		int ii=k;
		float ff=k;
		double dd=k;
		long l=k;System.out.println(dd);
		System.out.println(ii);
		System.out.println(ff);
		System.out.println(dd);
		System.out.println(l);
		
		
		

	}

}