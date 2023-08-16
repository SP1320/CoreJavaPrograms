package basic;

import java.util.Scanner;

public class SecondSmallest {
             public int getSecondSmallest(int[]arr) {
            	 return arr[1];
             }
	public static void main(String[] args) {
		SecondSmallest obj=new SecondSmallest();
		String l;
		String[]arr;
		int[]a;
		Scanner s= new Scanner(System.in);
		l=s.nextLine();
		l=l.replaceAll("\\s+"," ");
		arr=l.split(",");
		a=new int[arr.length];
		for(int i = 0; i <a.length ;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
		int result=obj.getSecondSmallest(a);
		System.out.println(result);

}
}

