
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
    //349. Intersection of Two Arrays
    public int[] intersection(int[] nums1, int[] nums2) {

        // Create HashSets to store unique elements
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add elements from nums1 to n1 set
        for (int num : nums1) {
            n1.add(num);
        }

        // Check if nums2 elements are in n1 and add to result set if they are
        for (int num : nums2) {
            if (n1.contains(num)) {
                result.add(num);
            }
        }

        // Convert the HashSet result to an array
        int[] arr = new int[result.size()];
        int i = 0;
        for (int no : result) {  
            arr[i++] = no;
        }

        return arr;
    }
    //26. Remove Duplicates from Sorted Array
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }
    }
    //27. Remove Element
    public int removeElement(int[] nums, int val) {
        int i =0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    //35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;

        while (first <= last){
            int mid = first + (last - first) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                first = mid+1;
            }else{
                last = mid - 1;
            }
        }
        return first;
    }
    //66. Plus One
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0, i = m; j<n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    //217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //219. Contains Duplicate II
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            // Update or add the element with the current index
            map.put(nums[i], i);
        }
        return false;
    }
    //1385. Find the Distance Value Between Two Arrays
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans =0;
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j]) <= d){
                    ans++;
                    break;
                }
            }
        }
        return (arr1.length-ans);
    }
}
