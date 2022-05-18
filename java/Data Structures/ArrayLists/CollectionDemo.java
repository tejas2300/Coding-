import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Vector <Integer> v =new Vector();
        Hashtable <Integer,String > h=new Hashtable();
        ArrayList <Integer> arri =new ArrayList<>();
        int n=3;


        for (int i = 1; i <= n; i++)
        arri.add(i);


        v.addElement(4);
        v.addElement(5);
        v.addElement(6);
        v.addElement(7);


        arri.remove(2);

        

        h.put(1,"Tejas");
        h.put(2,"Soham");
        h.put(3,"Latika");
        h.put(4,"Tanvi");




        System.out.println(arr[4]);        
        System.out.println(v.elementAt(3));
        System.out.println(h.get(3));
        System.out.println(arri);
        
        for (int i = 0; i < arri.size(); i++)
        System.out.print(arri.get(i) + " ");



    }   

}