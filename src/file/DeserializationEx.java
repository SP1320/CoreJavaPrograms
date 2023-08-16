package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        FileInputStream fis=new FileInputStream("Serialization.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        EmployeeEx e=null;
        EmployeeEx e2=null;
        EmployeeEx e3=null;
        e=(EmployeeEx)ois.readObject();
        e2=(EmployeeEx)ois.readObject();
        e3=(EmployeeEx)ois.readObject();
        System.out.println("Data in the file :");
        e.display();
        e2.display();
        e3.display();
        ois.close();
        fis.close();
	}

}
