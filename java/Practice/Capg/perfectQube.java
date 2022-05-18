import java.util.Scanner;

public class perfectQube {

    public static int nextPerfect(int a) {
        int cube;
        int returnval = 0;
        for (int i = 0; i < a; i++) {

            cube = i * i * i;
            if (a == cube) {
                returnval = a;
                break;
            } else {
                int nextN = (int) Math.floor(Math.cbrt(a)) + 1;

                returnval = nextN * nextN * nextN;
            }

        }
        return returnval;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum = sum + a;
        }
        ans =  nextPerfect(sum)-sum ;
        if (ans == 0) {
            System.out.println("Yes");

        } else {
            System.out.println(ans);
        }
    }

}
