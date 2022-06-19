package Practice.Kypn;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Watch [] watchs=new Watch[4];
        for(int i =0; i<watchs.length;i++){
            int wid=sc.nextInt();
            sc.nextLine();
            String wname=sc.nextLine();
            int price =sc.nextInt();
            watchs[i]=new Watch(wid, wname, price);
        }
        String searchName=sc.next();
        if(findwatchbyName(watchs,searchName)>0){
            int price=findwatchbyName(watchs,searchName);
            System.out.println("The price is "+ price);
        }else{
            System.out.println("No such Watch");
        }
      

    }
    public static int findwatchbyName(Watch[] watchs,String name){
        int price=0;
        
        for(int i=0;i<watchs.length;i++){
            String rname=watchs[i].getWname().toLowerCase();
            if(rname.equalsIgnoreCase(name)){
                price= watchs[i].getPrice();
            }else
            price=0;
        }
        return price;

        
    }
    
}
class Watch{
    private int wid;
    private String wname;
    private int price;

    public Watch(int wid,String wname , int price){
        super();
        this.wid=wid;
        this.wname=wname;
        this.price=price;


    }

    

    
    public String getWname() {
        return this.wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public int getPrice() {
        return this.price;
    }

   
  
}
