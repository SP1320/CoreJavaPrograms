package oops;

public class ClassEx {
	int empid;
	String empname;

	void display() {
		System.out.println("Employee Id is :" + empid);
		System.out.println("Employee Name is :" + empname);
	}

	public static void main(String[] args) {
		ClassEx emp = new ClassEx();
		emp.empid = 1;
		emp.empname = "Sneha Pawar";
		emp.display();

	}

}
