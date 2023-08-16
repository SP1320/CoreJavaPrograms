package exception;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
	
}
public class MarksheetEx {
    String checkMarks(int marks) throws MyException {
    	if(marks>45) {
    		
    		return "pass";
    	}else {
    		throw new MyException("fail");
    	}
    }
	public static void main(String[] args)  {
		MarksheetEx i=new MarksheetEx();
		try {
			String s=i.checkMarks(35);
			System.out.println(s);
			
		} catch (MyException e) {
			System.out.println(e);
			
		}
		

	}

}