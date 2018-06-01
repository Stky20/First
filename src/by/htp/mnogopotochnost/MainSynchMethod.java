package by.htp.mnogopotochnost;

public class MainSynchMethod {

	public static void main(String[] args) throws InterruptedException {
		Matrix matrix = new Matrix(15);
		Thread1 th1 = new Thread1(1, matrix);
		Thread1 th2 = new Thread1(2, matrix);
		Thread1 th3 = new Thread1(3, matrix);
		
		th2.start();
		
		th1.start();
		
        th3.start();
        
        
        th1.join();
        th2.join();
        th3.join();
        
        matrix.print();
	}

}
