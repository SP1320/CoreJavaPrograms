package oops;

class Privatedemo {
	int a= 1;
	Privatedemo(int i){
		a=i;
		System.out.println(a);
	}
	 public void display() {
		System.out.println("Display Call");

	}

}

public class PrivateAccessEx {
	private int a;

	public static void main(String[] args) {
		Privatedemo d = new Privatedemo(10);
		d.display();
		System.out.println(d.a);

	}

}