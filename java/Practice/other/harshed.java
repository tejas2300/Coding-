package Practice.other;

public class harshed {
    public static void main(String[] args) {
        int number=18;
        int n=number;
        int result =0 ;
        while(n!=0){
            int pic_last=n%10;
            result=result+pic_last;
            n=n/10;
        }
        if(number%result==0){
            System.out.println("It is harshed Number");
        }else{
            System.out.println("It is Not a harshed number ");
        }
    }
    
}
