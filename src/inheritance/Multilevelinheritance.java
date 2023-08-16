package inheritance;
class laptop{
	   String item="laptop";
	   void displayitem() {
		   System.out.println("Item is :"+item);
	   }
} 
 class name extends laptop{
	 String itemname="Hp";
	 void displayitemname() {
		 System.out.println("Item Name is :"+itemname);
	 }
 }
 class version extends name{
	 String model="HP 15-S RYZEN";
	 void displaymoel() {
		 System.out.println("Model Name is :"+model);
	 }
 }
	public class Multilevelinheritance{
		public static void main(String[] args) {
			version v=new version();
			v.displayitem();
			v.displayitemname();
			v.displaymoel();
			
		}
	}