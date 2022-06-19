import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Player {
    static int temp[] = new int[4];
    static int temp2[] = new int[4];

    public static void main(String[] args) {

        int N = 4;
        int Y = 3;

        int[][] arr3 = new int[][] {
                { 5, 6, 8, 7 },
                { 1, 2, 4, 3 },
                { 1, 2, 3, 4 },
                { 3, 6, 9, 5 },
        };
        int[][] arr4 = new int[][] {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 1, 2, 3, 4 },
                { 3, 6, 9, 5 },
        };

        findRes(arr3, arr4);

    }

    public static int secondMaxIndex(ArrayList<Integer> intArray) {
        int largest = intArray.get(0);
        Integer largest2 = null;
        int maxIndex = 0;
        int maxIndex2 = 0;

        for (int i = 0; i < intArray.size(); i++) {
            if (largest < intArray.get(i)) {
                largest2 = largest;
                maxIndex2 = maxIndex;
                largest = intArray.get(i);
                maxIndex = i;
            } else if (largest2 == null || intArray.get(i) > largest2) {
                largest2 = intArray.get(i);
                maxIndex2 = i;
            }
        }

        return maxIndex2;
    }

    public static int getIndexOfLargest(int[] array) {
        if (array == null || array.length == 0)
            return -1; // null or empty

        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest])
                largest = i;
        }
        return largest;
    }

    public static int getIndexOfsLargest(int[] intArray) {
        int largest = intArray[0];
        int maxIndex2 = 0;
        for (int i = 0; i <= intArray.length - 1; i++) {
            if (largest < intArray[i]) {
                largest = intArray[i];
            }
        }
        for (int j = 0; j <= intArray.length - 1; j++) {
            if (intArray[j] < largest) {
                maxIndex2 = j;
            }
        }
        return maxIndex2;
    }

    public static int[] addPointint1(int arr[], int n) {
        int temp[] = new int[4];
        temp[n] += 5;
        return temp;
    }

    public static int[] addPointint2(int arr[], int n2) {
        int temp[] = new int[4];
        temp[n2] += 5;
        return temp;
    }

    public static void findRes(int i[][], int j[][]) {

        for (int k = 0; k < 4; k++) {
            temp[k] = i[1][k];
            temp2[k] = j[1][k];
            
            int n2 = getIndexOfsLargest(temp);
            int n = getIndexOfLargest(temp);

            temp2[n] = temp2[n] + 5;
            temp2[n2] = temp2[n2] + 3;
            for (int a = 0; a < 4; a++) {
                System.out.println(temp2[a]);
            }


        }
        
        // int n2 = getIndexOfsLargest(temp);
        // int n = getIndexOfLargest(temp);

        // temp2[n] = temp2[n] + 5;
        // temp2[n2]=temp2[n2]+3;
        // for(int a=0;a<4;a++){
        //     System.out.println(temp2[a]);
        // }


    }

}