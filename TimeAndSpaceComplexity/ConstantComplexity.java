package TimeAndSpaceComplexity;

public class ConstantComplexity {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        arr[0] = arr[0] + 10; // Time C. -> O(1)
        System.out.println(arr[0]);
        // Time complexity breakdown : O(1) + O(1) = O(2) == O(1)
        // We don't calculate Space C. here for our input elements ( arr [] )
        // To calculate the Space C. we see how much additional space is required , but it is not present here


        // Here we are creating additional space
        int num = arr[arr.length - 1];
        // Space C. O(4bytes) = O(1)
        // Time C. is O(1) because
        //      1. arr[] -> O(1)
        //      2. arr.length -> O(1)
        //      3. arithmetic operations -> O(1)
        //      4. Storing in num -> O(1)
        //      Total Time C. = O(1) + O(1) + O(1) + O(1) = O(4) == O(1)
        // O(4) = O(1) // constant space complexity
    }
}