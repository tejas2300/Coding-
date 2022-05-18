package Practice.other;

import java.util.*;

 class mixture {
    public static void main(String[] args) {
        int n1, n2, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        n = sc.nextInt();
        if (n % 2 == 0) {
            n1 = evens(n / 2);
            System.out.println(n1);
        } else {
            n2 = odds(n / 2 + 1);
            System.out.println(n2);
        }

    }

    static int evens(int i) {
        int count = 0,j;
        int num = 1;
        while (count < i) {
            num = num + 1;
            for (j = 2; j <= num; j++) {
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

    static int odds(int i) {
        if (i <= 0) {
            return i;
        } 
            return odds(i - 1) + odds(i - 2);
    }
}
