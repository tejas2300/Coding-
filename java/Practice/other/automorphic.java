package Practice.other;

public class automorphic {
    public static void main(String[] args) {
        int a=5;
        String as=Integer.toString(a);
        int l1=as.length();
        int sq=a*a;
        String sqs=Integer.toString(sq);
        int l2=sqs.length();
        String s3=sqs.substring(l2-l1);
        System.out.println(as);
        System.out.println(s3);
        if (as.equals(s3)){
            System.out.println("Yes ! Automorphic Number");
    
        }else {
            System.out.println("NO !it is not an Automorphic Number");
        }
    

    }
}
