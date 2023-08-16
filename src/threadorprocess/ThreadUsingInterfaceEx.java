package threadorprocess;
class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1 :");
		for(int i = 0; i < 5; i++){
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("Thread2 :");
		for(int i=0;i<=10;i++){
			System.out.println(i);
}
	}
}
class ThreadMulti extends Thread{
	public void run() {
		System.out.println("Threadmulti :");
		int num = 9; 
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "
                               + num * i);
}
	}
}
class ThreadFact extends Thread{
	public void run() {
		System.out.println("ThreadFact :");
		int num2=5;
		int fact=1;
		int j = 1;
		do {
			fact=fact*j;
			j++;
		}
		while(j<=num2);
		{
			fact=fact*1;
			j++;
		}
		System.out.println(fact);
		}
}

public class ThreadUsingInterfaceEx {
	public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread t= new Thread(t1);
	t.start();
	Thread2 t2=new Thread2();
	t2.start();
	ThreadMulti tm=new ThreadMulti();
	tm.start();
	ThreadFact tf=new ThreadFact();
	tf.start();
	//ThreadEven te=new ThreadEven();
	//te.start();
	}

}

