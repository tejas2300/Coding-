import java.util.*;

class Source {

    public static String[] getToys(String arr[]) {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(arr));
        Collections.sort(input);
        String[] result = new String[input.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputArray[] = new String[6];
    


        // for (int i = 0; i < inputArray.length; i++) {
        //     inputArray[i] = scanner.nextLine().trim();
        // }


        int i=0;
        while (scanner.hasNextLine()&&i<6) {
            inputArray[i] = scanner.nextLine().trim();
          i++;           
        }



        String result[] = getToys(inputArray);
        System.out.println("  \n");
        for (String str : result) {
            
            System.out.println(str);
        }
    }
}