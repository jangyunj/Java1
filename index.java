public ArrayList<Integer>intersectElegant(int[]array1,int[]array2){
//array1: i length m
//array2: i length n

/* loop through both arrays
if one element is less than the other, there can be no intersection
-increment the lower pointer
-if elements are equal collect, then increment either of the pointers */

int i=0;int m=array1.length;int j=0;int n=array2.length;

ArrayList<Integer>collector=new ArrayList<>();

//O(n or m)
while(i<m&&j<n){if(array1[i]array2[j]){i++;}else if(array2[j]<array1[i]){j++;}else{ //equal
collector.add(array1[i]);i++;}}return collector;

}

//Fibonacci 
public class FibonacciNaive {
    public int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

// Memoization - Optimization technique
public class FibonacciMemoized {
    private int[] memo = new int[1001];

    public int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] == 0) {
            memo[n] = fib(n: n-1) + fib(n: n-2);
        } 
        return memo[n];
    }
}

// top 3 sorting algorithms: bubble sort, merge sort, quicksort