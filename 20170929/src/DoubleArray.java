
public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] ar = {{10, 20}, {30, 40}};
		int i, j;
		
		for(i=0;i<ar.length;i++) {
			for(j=0;j<ar[i].length;j++) {
				System.out.print(" " + ar[i][j]);
			}
			System.out.println();
		}
	}

}
