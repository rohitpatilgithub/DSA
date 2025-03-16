package TimeAndSpaceComplexity;

public class LogComplexity {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,10};

        // T.C -> O(n) | S.C -> O(1)
        var a = System.nanoTime();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==6) System.out.println("Found 4 at index " + i);
        }
        var b = System.nanoTime();
        System.out.println("Linear T.C time : "+(b-a));

        // T.C -> O(log n)
        a = System.nanoTime();
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == 6){System.out.println("Found " + arr[mid]); break;}
            else if(arr[mid] < 6) start = mid + 1;
            else end = mid - 1;
        }
        b = System.nanoTime();
        System.out.println("Binary T.C time : "+(b-a));
    }
}
