package by.htp.mnogopotochnost;

public class Thread2 implements Runnable{
	
	int threadNumber;
	Matrix matrix;
	
	public Thread2 (int number, Matrix matrix) {
		threadNumber= number;
		this.matrix = matrix;
	}

	@Override
	public void run() {
		
		int n = matrix.matrix.length - 1;
		while (matrix.matrix[n][n] == 0) {
			synchronized (matrix) {
				matrix.putNumberInDiag2(threadNumber);
			}
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
	}

}
