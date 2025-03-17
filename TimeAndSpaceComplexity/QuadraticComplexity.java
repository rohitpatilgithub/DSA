package TimeAndSpaceComplexity;

public class QuadraticComplexity {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,10,0,4,8,6};
        int target = 5;

        for(int i = 0 ; i < arr.length ; i++){ // T.C -> O(n)
            for(int j = i+1 ; j < arr.length ; j++){ // T.C -> O(n)
                if(arr[i]+arr[j] == target){
                    System.out.println("We have a pair : "+arr[i] +" & "+ arr[j]);
                }
            }
        }

        // Total time complexity is O(n ^ 2) which is quadratic T.C which is not good
        // Why O(n ^ 2) : for each outer loop O(n) we have to do O(n) times which is our inside inner loop

        // To achieve more optimized code
        // we do O(n ^ 2) to O(n) to O(1)
    }
}
