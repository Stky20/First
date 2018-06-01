package by.htp.mnogopotochnost;

public class Thread1 extends Thread {
	
	int threadNumber;
	private Matrix matrix;
	
	public Thread1(int number, Matrix matrix) {
		threadNumber = number;
		this.matrix = matrix;
	}

	public void run() {
		int n = matrix.matrix.length - 1;
		while (matrix.matrix[n][n] == 0) {
			matrix.putNumberInDiag(threadNumber);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
