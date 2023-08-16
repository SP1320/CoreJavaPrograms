package inheritance;
class Car{
	public void carName() {
		System.out.println("The car is :");
	}
}
class Maruti extends Car{
	public void carName() {     //Call the superclass method
		System.out.println("Maruti");
	}
}
public class SuperMethodEx {

	public static void main(String[] args) {
		Maruti carN=new Maruti();
		carN.carName();

	}

}
