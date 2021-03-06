
/* 
   You can use System.out.println for debugging purposes, e.g.
   System.out.println("this is a debug message");
*/

public class EndToEndPaths {

	public static int getNoOfPaths(int m, int n, int p, int[] numbers){
		
	/* Write your code here
	   Do not write System.out.println here or any other printing statements
       Your code may get 0 marks if you do not follow above instruction. 
	*/
	    int[][] buildArray = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				buildArray[i][j] = 0;
			}
		}

		for (int i = 0; i < numbers.length; i += 2) {
			buildArray[numbers[i]][numbers[i + 1]] = -1;
		}
		return countPaths(buildArray, m, n, 0, 0);	
	 
	}
	public static int countPaths(int[][] arrA, int m, int n, int row, int col) {
		
		if (row == m - 1 && col == n - 1) {
			return 1;
		}
		int down = 0, right = 0;
		if (row != m - 1 && arrA[row + 1][col] != -1) {
			down = countPaths(arrA, m, n, row + 1, col);
		}
		if (col != n - 1 && arrA[row][col + 1] != -1) {
			right = countPaths(arrA, m, n, row, col + 1);
		}
		return down + right;

	}
    public static void main(String args[]) {
	    /*
	        You can use Console input as well with the help of Scanner or BufferedReader classes.
		Please provide input data in Input box on right side of window.
	    */
	    int m = 4, n = 3, p = 2;
	    int numbers[] = {2, 0,2, 2};		
	    System.out.println(getNoOfPaths(m,n,p,numbers));
	}
}



