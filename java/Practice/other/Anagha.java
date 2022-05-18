package Practice.other;

public class Anagha {
    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result =result + gcd(result, element);
			System.out.println(result);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 8,20,15,10};
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
}