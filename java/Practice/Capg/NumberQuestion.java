import java.util.Scanner;

public class NumberQuestion {


    static int maxproduct(int n){
        if(n==2||n==3){
            return (n-1);

        
        }
        int res=1;
        while(n>4){
            n-=3;
            res*=3;

        }
        return (n*res);
        

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(maxproduct(n));
    }
    
}
