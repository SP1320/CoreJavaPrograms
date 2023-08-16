package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int empid,salary;
	String name;
	public Employee(int empid, int salary, String name) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
}
class sortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
class sorybysalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}
	
}
class sortbyempid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empid-o2.empid;
	}
	
}
public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Employee>ar= new ArrayList<Employee>();
		ar.add(new Employee(1320, 35000, "Sneha"));
		ar.add(new Employee(1420, 40000, "Asmita"));
		ar.add(new Employee(1325, 30000, "Priyanka"));
		ar.add(new Employee(1550, 45000, "Monika"));
       // Collections.sort(ar, new sortByName());
        //Collections.sort(ar, new sorybysalary());
        Collections.sort(ar, new sortbyempid());
        System.out.println("Sort by  employee name :");
        for(int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        }
	}

}
