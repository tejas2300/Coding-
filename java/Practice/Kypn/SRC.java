package Practice.Kypn;

import java.util.Scanner;

public class SRC {
    static String[] mobile = { "Samsung S8", "One Plus 8", "Sony Experia" };

    static String[] tv = { "VU 55 Inches", "Sony TV", "Samsung Tv" };

    static String[] electronics = { "Speakers", "DSLR Cameras", "Security Cameras" };

    public static void main(String[] args) {
        String s="";
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        switch (s) {

            
            case "mobile":

            for(int i=0;i<mobile.length;i++)

                System.out.println(mobile[i]);

               
                break;
            case "tv":

            for(int i=0;i<mobile.length;i++)

                System.out.println(tv[i]);

               
                break;
            case "electronics":
            for(int i=0;i<mobile.length;i++)

                System.out.println(electronics[i]);
                break;
            default:
                System.out.println("no Products Available");
        }


    }

    
}
