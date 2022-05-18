package Practice.other;

public class LCM {
    public static void main(String[] args) {
        int num1=23;
        int num2 =46;
        int i;
        int a;
        a=(num1 > num2) ? num1:num2;
        for(i=a;i<=num1*num2;i=i+a){
            if(i%num1==0&&i%num2==0){
                break;
            }
        }
        System.out.println(i);
    }
    
}
