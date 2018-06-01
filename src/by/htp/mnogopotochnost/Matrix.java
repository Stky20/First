package by.htp.mnogopotochnost;

public class Matrix {
	
	int n;
	int[][] matrix;
	
	public Matrix(int n) {
		this.n = n;
		matrix = new int[n][n];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	public synchronized void  putNumberInDiag(int number) {
		
		
			for(int i = 0; i < n; i++) {
				if (matrix[i][i] == 0) {
					matrix[i][i] = number;
					System.out.println("thread # " + number + " filled cell # " + i + " : " + i );
					return;
				}
										
			}
		
		
	}

	public void  putNumberInDiag2(int number) {
		
		
			for(int i = 0; i < n; i++) {
				if (matrix[i][i] == 0) {
					matrix[i][i] = number;
					System.out.println("thread # " + number + " filled cell # " + i + " : " + i );
					return;
				}
					
		
		}
	}
	
	public void print() {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}
		
		
		
		
	}
	

}
