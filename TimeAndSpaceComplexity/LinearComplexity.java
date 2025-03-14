package TimeAndSpaceComplexity;

public class LinearComplexity {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        arr[0] = arr[0]+10;// Time C. = O(1) | S.C = O(1) (Constant)


        for(int i = 0 ; i < arr.length ; i++){ // Time C. = O(n) | Space C. O(1)
            System.out.println(arr[i]);
        }

        // Task for Space C.
        int copyArr[] = new int[arr.length]; // T.C = O(1) | S.C = O(n)

        for(int i = 0 ; i < arr.length ; i++){  // T.C = O(n) | S.C = O(1)
            copyArr[i] = arr[i];
        }

        for(int c : copyArr){ // T.C = O(n) | S.C = O(1)
            System.out.println(c);
        }

        System.out.println(arr[0]);
        // Before Task Total Time C. -> O(1) + O(1) + O(n) = O(2 + n) == O(n) Linear Time C.
        // Before Task Total Space C. -> O(1)

        // Overall Space C. -> 1+1+n+1+1+1 = O(5 + n) == O(n)
        // Overall Time C. -> 1+n+1+n+n+1 = O(3 + 3n) == O(3n) == O(3 * n) == O(n)
    }
}
