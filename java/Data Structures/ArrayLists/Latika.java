import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class Latika {
    // int n;
    // String s;
    // public Latika(int n, String s){
    //  this.n=n;
    //  this.s=s;

    // }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        Vector <Integer> v= new Vector<>();
        ArrayList<Integer> v1=new ArrayList<>();
        Hashtable<Integer, String> h=new Hashtable<>();


        h.put(1, "Soham");
        h.put(2, "Tejas");
        h.put(3, "Latika");
        h.put(4, "Tanvi");
        for(int i=1; i<=h.size();i++)
        System.out.println(h.get(i));


        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
     v.remove(4);
     v.remove(3);
    


// for(int i=0; i<l.size();i++)
// System.out.println(l.get(i));



String str = "application";   
System.out.println(str.charAt(3));


        // for(int i=0; i<6;i++)
        //     System.out.print(" "+arr[i]);
        
    


    }
    
}
