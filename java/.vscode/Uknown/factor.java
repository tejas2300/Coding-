public class factor {
    public static void main(String[] args) {
        int i,j;
        int t=15;
        int s=50;
        for(i=1;i<t;i++){
            for(j=1;j<i;j++){
                if(i+j==t && i*j==s){
                    System.out.print(j+""+i);
                }
            }
        }

    }
    
}
