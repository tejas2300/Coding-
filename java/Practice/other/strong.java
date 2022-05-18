public class strong {
    public static void main(String[] args) {
        int s1=145;
        int sum=0;
        int s=s1;
        while(s!=0){
            int fac=1;
            int r=s%10;
            for(int i=r;i>=1;i--){
                fac=fac*i;
            }
           
            sum=sum+fac;
            s=s/10;

        }
        System.out.println(s);
        System.out.println(sum);
        if (s1==sum){
            

            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}
