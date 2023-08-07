package nums;

public class ArrayCaseMatrix {

	public static void main(String[] args) {
		int[][] n=new int[5][6];
		System.out.println(n);
		System.out.println();
		
		System.out.println("array size =" + n.length);
		System.out.println();
		
		for( int i=0;i<n.length;i++) {
			System.out.println("size of n[" +i+"] = " + n[i].length);
			
			//---array iteration in a matrix form---/
			for(int j =0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "     ");
				System.out.println();
				
			}
		}
	}
}

	


