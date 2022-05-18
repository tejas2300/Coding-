class subsetSum {
    public static boolean subsetSum1(int[] A, int k) {
        int n = A.length;
        boolean[][] T = new boolean[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
            
        }
        return T[n][k];
    }

    public static void main(String[] args) {
        int[] A = { 7, 3, 2, 8 };
        int s = 6;
    
       
            if (subsetSum1(A, s )) {
                System.out.println("Subsequence with the given sum exists");
            } else {
                System.out.println("Subsequence with the given sum does not exist");
            }
        }

    }
