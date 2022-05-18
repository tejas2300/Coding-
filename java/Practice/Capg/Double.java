import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int j, k;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (j = 0; j < N; j++) {

            for (k = j + 1; k < N; k++) {
                if (arr[j] == arr[k]) {
                    arr[j] = arr[j] + 1;
                }
                else{
                    System.out.println("Wrong Input");
                }

            }
        }

        for (int l = 0; l < N; l++) {
            sum = sum + arr[l];

        }
        System.out.println(sum);
    }

}
