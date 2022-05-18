public class Divide { 
    public static void main(String[] args) {
        int n=13;
        int count=1;
        while(n!=0){
        if(n%2==0)  {
            n=n/2;
        }else{
            n=(n+1)/2;
           
        }
System.out.println(n);
     count++;
       
    }
    System.out.println(count);
    
}

}