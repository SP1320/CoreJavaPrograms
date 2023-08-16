package threadorprocess;

class Thrd {
	  
	synchronized static void operation(int data) {
	      for(int i = 1; i <= 4; i++) {
	         System.out.println(data++);   
	         try {
	            // each iteration performed with interval of 1 sec
	            Thread.sleep(1000);   
	         } catch(Exception exp){}   
	      }
	   }
	}
	class Thrd1 extends Thread {
	   public void run() {   
	      Thrd.operation(1);   
	   } 
	}
	class Thrd2 extends Thread {   
	   public void run() {   
	      Thrd.operation(5);   
	   }
	}
	class Thrd3 extends Thread {
	   public void run() {
	      Thrd.operation(10);   
	   }   
	}   
	public class StaticSynchronizationEx2 {
	   public static void main(String args[]) throws InterruptedException {
	      Thrd1 oprt1 = new Thrd1();   
	      Thrd2 oprt2 = new Thrd2();  
	      Thrd3 oprt3 = new Thrd3();
	      oprt1.start();   
	      oprt2.start();  
	      oprt3.start();
	   }
	}  