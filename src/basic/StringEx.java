package basic;

public class StringEx {

	public static void main(String[] args) {
		String str="Black";
		String str1="black";
		System.out.println("Length of the String is:" +str.length());
		System.out.println("Uppercase:" +str.toUpperCase());
		System.out.println("Lowercase:" +str.toLowerCase());
		System.out.println("Is both string are equal:" +str.equals(str1));
		System.out.println("Is both string are equal:" +str.equalsIgnoreCase(str1));
		System.out.println("Concate string:" +str.concat("Clouds"));
		System.out.println("Index of:" +str.indexOf('c'));
		System.out.println("Replace string:" +str.replace("Black", "pink"));
		
		
		
		
		
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
			for (String str5 : arrStr) {
				System.out.print(str5 + " ");
				
				
				
				
				String str11 = "Welcome to edubridge    ";
		        
		        //convert string into character array
		        char[] arr = str11.toCharArray();   
		        String tempStr = "";
		        for(char c:arr){
		            
		            if(c != ' '){
		                tempStr += c;
		            }
		           // System.out.println(c);
		            System.out.println("Temp"+tempStr);
		        }
		         str11 = tempStr;
		        System.out.println(str11);
			}
	}

}
