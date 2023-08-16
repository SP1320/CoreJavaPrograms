package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationEx {//A marker interface in Java is an empty interface with no fields or methods. 
	//It has three types:
            //Serializable interface
            //Cloneable interface
             //Remote interface

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         EmployeeEx emp=new EmployeeEx();
         emp.empid=1;
         emp.empname="Sneha";
         emp.position="Java Developer";
         EmployeeEx emp2=new EmployeeEx();
         emp2.empid=2;
         emp2.empname="Asmita";
         emp2.position="Java Tester";
         EmployeeEx emp3=new EmployeeEx();
         emp3.empid=3;
         emp3.empname="Akash";
         emp3.position="Software Developer";
         FileOutputStream fos=new FileOutputStream("Serialization.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(emp);
         oos.writeObject(emp2);
         oos.writeObject(emp3);
         oos.close();
         fos.close();
         System.out.println("Data Saved in a file ");
         
	}

}
