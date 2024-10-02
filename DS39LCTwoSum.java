
import java.util.*;


public class DS39LCTwoSum {
    public static void main(String[] args) {
        int nums[] = {3, 6, 7, 8, 4};
        int[] result = twoSum(nums, 7);  // Store the result
        if(result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);  // Print the result
        } else {
            System.out.println("No solution found");
        }
    }
    //1. Two Sum
    public static  int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    public int scoreOfString(String s) {
        int res=0;
        for(int i = 0; i<s.length()-1; i++){
            res+=Math.abs((s.charAt(i)-s.charAt(i+1)));
        }
        return res;
    }
    //509. Fibonacci Number
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    //1331. Rank Transform of an Array
    public int[] arrayRankTransform(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);

        Map<Integer, Integer> map = new HashMap<>();
        int rank =1;

        for(int num : clone){
            if (!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    } 
}
