package Practice.other;


import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class mixture2 {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int n1, n2;
        if (n % 2 == 0) {
            n1 = evens(n / 2);
            System.out.println(n1);
        } else {
            n2 = odds(n / 2 + 1);
            System.out.println(n2);
        }
    }

    static int odds(int n) {
        if (n <= 1) {
            return n;
        }
        return odds(n - 1) + odds(n - 2);
    }

    static int evens(int n) {
        int count = 0, i;
        int num = 1;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count += 1;
            }
        }
        return num;

    }
}
