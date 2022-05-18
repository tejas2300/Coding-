import java.util.*;

class Tejas {

    static int N = 4;

    // function find maximum sum path

    static int MaximumPath(int Mat[][])

    {

        int result = 0;

        // create 2D matrix to store the sum

        // of the path

        int dp[][] = new int[N][N + 2];

        // initialize all dp matrix as '0'

        for (int[] rows : dp)

            Arrays.fill(rows, 0);

        // copy all element of first row into

        // 'dp' first row

        for (int i = 0; i < N; i++)

            dp[0][i + 1] = Mat[0][i];

        for (int i = 1; i < N; i++)

            for (int j = 1; j <= N; j++)

                dp[i][j] = (Math.max(dp[i - 1][j - 1],

                        Math.max(dp[i - 1][j],

                                dp[i - 1][j + 1])))
                        +

                        Mat[i][j - 1];

        // Find maximum path sum that end ups

        // at any column of last row 'N-1'

        for (int i = 0; i <= N; i++)

            result = 100- Math.max(result, dp[N - 1][i]);

        // return maximum sum path

        return result;

    }

    // driver code

    public static void main(String arg[])

    {

        int Mat[][] = { { 4, 6, 14, 21 },

                { 17,0,5,5 },

                { 4,41,22,3 },

                { 2,51,6,0 } };

        System.out.println(MaximumPath(Mat));

    }
}