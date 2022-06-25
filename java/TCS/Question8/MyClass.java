import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p[] = new Player[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            String country = sc.next();
            String side = sc.next();
            double price = sc.nextDouble();
            p[i] = new Player(id, country, side, price);
        }
        String input_side = sc.next();

        int  ans[] = new int [4];
        ans = searchPlayerForMatch(input_side, p);
        for (int j = 0; j < ans.length; j++) {
            if(ans[j]>0)
            System.out.println(ans[j]);
        }

    }

    public static int[] searchPlayerForMatch(String search, Player[] players) {
        int[] p = new int [4];
        int j = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getSide().equalsIgnoreCase(search)) {
                p[j++] = players[i].getId();
            }
        }
        return p;

    }
}

class Player {
    private int id;
    private String country;
    private String side;
    private double price;

    Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;

    }

    Player() {

    }

    public int getId() {
        return this.id;
    }

    public String getSide() {
        return this.side;
    }

}