package basic;

public class LocalVariableEx {
	public void StudentAge()
	{
		int age=0;
		age=age+30;
		System.out.println("Student age is:" +age);
	
	}
	public static void main(String[] args) {
		LocalVariableEx ex=new LocalVariableEx();
		ex.StudentAge();

	}

}
