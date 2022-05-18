class subS {
    public static int subsetSum1(int[] A, int sum) {

        int n = A.length;
        int [][] T = new int [n + 1][sum + 1];
        for (int i = 0; i < n; i++) {
            T[i][0] = 1;
        }
       
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sum; j++) {
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                } else
                    T[i][j] = (T[i - 1][j]) +( T[i - 1][j - A[i - 1]]);
            }

        }
        return T[n][sum];
    }

    public static void main(String[] args) {
        int[] A = { 7, 3, 2, 8 ,18,10};
        int sum = 18;
            System.out.println(subsetSum1(A, sum));
       
    }

}
