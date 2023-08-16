package exception;

public class ClassNotFound {

	public static void main(String[] args) {
                   try {
					//Class.forName("class not exist");
					Class.forName("basic.EnumExample");
					
					//Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Class Found");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e);
				}
	}

}
