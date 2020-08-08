import java.util.Scanner;

public class Array2DRotate {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int dimensions = sc.nextInt();
		int mSize = dimensions -1;
		int Array2D[][] = new int[dimensions][dimensions];
		
		for(int i =0; i<dimensions; i++) {
			for(int j=0; j<dimensions; j++) {
				Array2D[i][j] = sc.nextInt();
			}
		}
		int[][] Matrix = CloneMatrix(Array2D);
		
		
		//rotate by 90 degrees counterclockwise (270 degrees clockwise)
		
		for(int x=0; x<dimensions; x++) {
			for(int y=0; y<dimensions; y++) {
				Array2D[x][y] = Matrix[y][mSize-x];
			}
		}
		
		  for(int []x:Array2D){
	            for(int y:x){
	            System.out.print(y+" ");
	            }
	            System.out.println();
	        }
		
	}
	
	public static int[][] CloneMatrix(int[][] matrix) {
		
		int[][] newMatrix = new int[matrix.length][matrix.length];
		
		for(int i =0; i<matrix.length; i++) {
			for(int y=0; y<matrix.length; y++) {
				matrix[i][y] = newMatrix[i][y];
			}
		}
		
		return newMatrix;
		
	}

}


