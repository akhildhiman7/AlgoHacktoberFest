class Islands {

    // Function to find the number of island in the given list A
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> A, int N, int M) {
        int islands = 0;
		
		// looping through the row and column basis
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A.get(i).get(j) == 1){
					// only find the adjacent cells for ones when current cell has one(1) else pass the cell
                    islands += findAll(A, N, M, i, j);
                }
            }
        }
        return islands;
    }
    
    static int findAll(ArrayList<ArrayList<Integer>> A, int N, int M, int i, int j){
        if(i>=0 && i<N && j>=0 && j<M){
            if(A.get(i).get(j) == 0) return 0;
            A.get(i).set(j, 0);
            findAll(A, N, M, i+1, j);
            findAll(A, N, M, i-1, j);
            findAll(A, N, M, i+1, j+1);
            findAll(A, N, M, i+1, j-1);
            findAll(A, N, M, i, j+1);
            findAll(A, N, M, i, j-1);
            findAll(A, N, M, i-1, j+1);
            findAll(A, N, M, i-1, j-1);
            return 1;
        }
        return 0;
    }
}
