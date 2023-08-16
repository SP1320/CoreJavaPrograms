package basic;

public class RelationalEx {

	public static void main(String[] args) {
		
		
		//Relational operator
		int a=20;
		int b=25;
		String s="hello";
		String s1="hello";
		System.out.println("a==b :"+(a==b));
		System.out.println("a!=b :"+(a!=b));
		System.out.println("a<b :"+(a<b));
		System.out.println("a>b :"+(a>b));
		System.out.println("a>=b :"+(a>=b));
		System.out.println("s==s1 :"+(s==s1));
		
		
		
		//Bitwise operator
		int c=5;
		int d=7;
		System.out.println("& :"+(c&d));
		System.out.println("| :"+(c|d));
		System.out.println("~ :"+(~d));
		System.out.println("^ :"+(c^d));
		
		
		
		//Shift operator
		//Left Shift
		int p=0010;
		System.out.println(">> :"+(p<<1));
		System.out.println("<< :"+(p<<2));
		System.out.println(">> :"+(p<<3));
		//Right Shift
		int p1=8;
		System.out.println(">> :"+(p1>>1));
		System.out.println("<< :"+(p>>2));
		System.out.println(">> :"+(p>>3));
		
		
		
		//Ternary operator
		int r=30;
		int n=25;
		String result= r<n?"r is max":"n is max";
		System.out.println("highest oftwo numbers  :"+result);
		
		
		
		//Three no
		int l = 10, z = 25, k = 15, max;
		  
        
        max = (l > k) ? (l > k ? l : k) : (z > k ? z : k);
 
        
        System.out.println("the max number is  " + l
                           + ", " + z + "  " + k + " is "
                           + max);
        
        
        
        
        //pass or fail
        int marks=80;
       
        String result2= marks>50?"Pass":"Fail";
        System.out.println("The Result Is  :"+result2);
		
        
        
        int l1 = 10, z1 = 25, k1 = 15, min;
		  
        
        min = (l1 < k1) ? (l1 < k1 ? l1 : k1) : (z1 < k1 ? z1 : k1);
 
        
        System.out.println("the max number is  " + l1
                           + ", " + z1 + "  " + k1 + " is "
                           + min);
        
        
       //Assignment Operator 
        int y=20;
		int o=25;
		System.out.println("y+=o :"+(y+=o));
        
	}

}
