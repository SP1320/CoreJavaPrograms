package basic;

public class ArrayEx {

	public static void main(String[] args) {
		
		//Single dimensional array
		int num[]= {2,3,4,};
		System.out.println(num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			
		//Multidimensional array
		int a[][] = { { 1, 2 }, { 4, 5 } };
		System.out.println("a[0][0]: " + a[0][0]);
		System.out.println("a[0][1]: " + a[0][1]);
		System.out.println("a[1]0]: " + a[1][0]);
		System.out.println("a[1][1]: " + a[1][1]);
		
		
		// System.out.println(num.length);
		for (int i1 = 0; i1 < 2; i1++) { // row
		for (int j = 0; j < 2; j++) { // column
		System.out.println(a[i1][j]);
				}

			}
		}
	}

}
