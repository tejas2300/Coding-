package Practice.other;

public class perfect {
    public static void main(String[] args) {
        int p = 28;
        int sum = 0;
        for (int i = 1; i <p; i++) {
            if(p%i==0)
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
