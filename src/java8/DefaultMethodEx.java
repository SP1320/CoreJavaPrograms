package java8;

 interface Interface{
	 void abstractmethod();
	 
	 default void display(){
		System.out.println(" interface......");
	}

  static void display1() {
	  System.out.println("Static Method......");
  }
public class DefaultMethodEx implements Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DefaultMethodEx dm= new DefaultMethodEx();
     dm.abstractmethod();
     Interface.display1();
	}
  @Override
	public void abstractmethod() {
		System.out.println("Abstract Method");
		
	}

}
 }
