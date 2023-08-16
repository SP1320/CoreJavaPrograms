package oops;

public class ConstructorOverloadingEx {
	int empid;
	String empname;
	int empage;

	ConstructorOverloadingEx(int ei, String en) {
		empid = ei;
		empname = en;
	}

	ConstructorOverloadingEx(int ei, String en, int ea) {
		empid = ei;
		empname = en;
		empage = ea;
	}

	void display() {
		System.out.println(empid + " " + empname + " " + empage);
	}

	public static void main(String[] args) {
		ConstructorOverloadingEx emp1 = new ConstructorOverloadingEx(20, "Sneha");
		ConstructorOverloadingEx emp2 = new ConstructorOverloadingEx(23, "Asmita", 20);
		emp1.display();
		emp2.display();
	}

}
	
