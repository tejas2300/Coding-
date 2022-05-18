package Practice.other;

public class DtoB {
    public static void main(String[] args) {
        int deci=23;
        int  bin[] =new int[20];
        int i=0;
        while(deci>0){
            int r=deci%2;
            bin[i++]=r;
            deci=deci/2;
        }

        System.out.println("Binary No. is :");
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]+" ");
        }
    }
}
  