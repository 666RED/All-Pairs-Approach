package allPair;


public class allPair {

	public static void main(String[] args) {
		final int INF = 100000;
		final int DIAGONAL = 0;
		int graph[][] = {{ DIAGONAL, 24, 40, 55, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF}, 
	 			 		 {24, DIAGONAL, INF, 60, 80, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF},
	 			 		 {40, INF, DIAGONAL, 19, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF},
	 			 		 {55, 60, 19,DIAGONAL, 25, 93, INF, INF, INF, INF, INF, INF, INF, INF, INF},
	 			 		 {INF, 80, INF, 25, DIAGONAL, INF, 40, INF, INF, INF, INF, INF, INF, INF, INF},
	 			 		 {INF, INF, INF, 93, INF, DIAGONAL, INF, 70, INF, INF, INF, INF, INF, INF, INF},
	 			 		 {INF, INF, INF, INF, 40, INF, DIAGONAL, 120, 43, INF, INF, INF, INF, INF, INF},
	 			 		 {INF, INF, INF, INF, INF, 70, 120, DIAGONAL, INF, INF, 56, INF, 80, INF, INF},
	 			 		 {INF, INF, INF, INF, INF, INF, 43, INF, DIAGONAL, 42, INF, INF, INF, INF, INF},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, INF, 42, DIAGONAL, 76, INF, 87, INF, INF},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, 56, INF, 76, DIAGONAL, 19, INF, INF, INF},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 19, DIAGONAL, INF, 19, INF},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, 80, INF, 87, INF, INF, DIAGONAL, INF, 30},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 19, INF, DIAGONAL, 20},
	 			 		 {INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 30, 20, DIAGONAL}
				 		};
		
		final int NUM_OF_NODE = 15;
		for(int i = 0; i < NUM_OF_NODE; i++) { // to generate 6 matrix
			for(int j = 0; j < NUM_OF_NODE; j++) { // for the row
				for(int k = 0; k < NUM_OF_NODE; k++) { // for the column
					if(i != j && i != k && j != k) { // if take node 0, than column 0 and row 0 will not be considered, the diagonal will always be 0, so not considered
						graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]); // relaxation
					}
				}
			}
			// printing out result
			System.out.println("Matrix " + (i + 1));
			for(int count = 0; count < NUM_OF_NODE; count++) {
				for(int count2 = 0; count2 < NUM_OF_NODE; count2++) {
					System.out.print(graph[count][count2] + " ");
				}
				System.out.print("\n");
			}
			System.out.println("\n\n");
		}
	}

}