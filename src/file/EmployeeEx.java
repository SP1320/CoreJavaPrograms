package file;

import java.io.Serializable;

public class EmployeeEx implements Serializable{
        int empid;
        String empname;
        String position;
        public void display(){
        	System.out.println("Employee Id :"+empid);
        	System.out.println("Employee Name :"+empname);
        	System.out.println("Employee Position :"+position);
        }
}
