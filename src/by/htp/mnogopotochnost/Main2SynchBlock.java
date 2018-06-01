package by.htp.mnogopotochnost;

public class Main2SynchBlock {

	public static void main(String[] args) throws InterruptedException {
		Matrix matrix = new Matrix(30);
		Runnable r1 = new Thread2(1, matrix);
		Runnable r2 = new Thread2(2, matrix);
		Runnable r3 = new Thread2(3, matrix);
		Runnable r4 = new Thread2(4, matrix);
		Runnable r5 = new Thread2(5, matrix);
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		Thread th3 = new Thread(r3);
		Thread th4 = new Thread(r4);
		Thread th5 = new Thread(r5);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		th5.join();		
		
		matrix.print();
		
	}

}
