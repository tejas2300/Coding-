import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 3;
        int r=4;
        int max[]=new int[4];
        HashMap<Integer,Integer> PlayerMap = new HashMap();
        for(int i=0;i<r;i++){
            Map.Entry<Integer, Integer> max[i] = null;
            Map.Entry<Integer, Integer> max2 = null;
            Map.Entry<Integer, Integer> max3 = null;

        }
       
        for(int i = 1;i <= n;i++){
            PlayerMap.put(i,new Random().nextInt(50)+1);
        }

        for(Map.Entry<Integer,Integer> playeentry : PlayerMap.entrySet()){
            Integer player = playeentry.getKey();
            Integer score = playeentry.getValue();
            System.out.println(player + " "+ score);
                if (max1 == null || playeentry.getValue().compareTo(max1.getValue()) > 0){
                    max1 = playeentry;
                }
        }
        for(Map.Entry<Integer,Integer> playeentry : PlayerMap.entrySet()){
            if (max2 == null || playeentry.getValue().compareTo(max2.getValue()) > 0
                    && playeentry.getValue().compareTo(max1.getValue())< 0) {
                max2 = playeentry;
            }
        }
        for(Map.Entry<Integer,Integer> playeentry : PlayerMap.entrySet()){
            if (max3 == null || playeentry.getValue().compareTo(max3.getValue()) > 0
                    && playeentry.getValue().compareTo(max1.getValue())< 0 && playeentry.getValue().compareTo(max2.getValue())< 0) {
                max3 = playeentry;
            }
        }

        System.out.print("p"+max1.getKey()+" is win , ");
        System.out.print("1st Place = p"+max1.getKey()+" got 5-points , ");
        System.out.print("2st Place = p"+max2.getKey()+" got 3-points , ");
        System.out.print("3st Place = p"+max3.getKey()+" got 1-points");
    }
}