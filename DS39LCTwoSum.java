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
    //118. Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int row = 1; row < numRows; row++) {
            List<Integer> prevRow = result.get(row - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1); // First element of each row is always 1

            for (int i = 1; i < row; i++) {
                currRow.add(prevRow.get(i - 1) + prevRow.get(i)); // Sum of two numbers directly above
            }

            currRow.add(1); // Last element of each row is always 1
            result.add(currRow);
        }

        return result;
    }
    //169. Majority Element
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    //242. Valid Anagram
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
            tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
        }

        return sCount.equals(tCount);
    }
    //  268 Missing number
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return Tsum - actualSum;
    }
    //11. Container With Most Water -med
    public int maxArea(int[] height) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        while (a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                max_area = Math.max(max_area, height[a_pointer]*(b_pointer-a_pointer));
                a_pointer  += 1;

            }
            else{
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer-a_pointer));
                b_pointer--;
            }
        }
        return max_area;
    }
    //389. Find the Difference
    class Solution {
        public char findTheDifference(String s, String t) {
            char[] Str1 = s.toCharArray();
            char[] Str2 = t.toCharArray();
    
            Arrays.sort(Str1);
            Arrays.sort(Str2);
    
            for(int i = 0; i<Str1.length; i++){
                if(Str1[i] != Str2[i]){
                    return Str2[i];
                }
            }
            return Str2[Str2.length-1];
        }
    }
    //350. Intersection of Two Arrays II 
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1 * len2];
        int i = 0, j = 0, k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                ans[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
    import java.util.*;

    //25. Valid Palindrome
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        
        int i = 0;
        int j = s.length() - 1;

        // Check if the string is a palindrome
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;  // Move from the start of the string
            j--;  // Move from the end of the string
        }
        
        return true;
    }
    //80. Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;  // No need to process if the array has 2 or fewer elements
        }

        int i = 2;
        for(int j = 2; j<nums.length; j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    //121. Best Time to Buy and Sell Stock
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; 
        int max = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        } 
        return max;

    }
    //28. Find the Index of the First Occurrence in a String
    public int strStr(String haystack, String needle) {
        // Handle the case where the needle is empty
        if (needle.isEmpty()) {
            return 0;
        }

        // Loop through the haystack but only till there's enough space left for needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the first characters match
            if (haystack.charAt(i) == needle.charAt(0)) {
                // Check if the substring matches the needle
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;  // Return the starting index
                }
            }
        }
        
        // Return -1 if the needle is not found
        return -1;
    }
    //392. Is Subsequence
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();        
    }
    //13. Roman to Integer
    class Solution {
        public int romanToInt(String s) {
            // Create a map to store Roman numerals and their corresponding integer values
            Map<Character, Integer> map = new HashMap<>();
    
            // Populate the map with Roman numeral values
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
    
            // Initialize the result with the last character's value
            int res = map.get(s.charAt(s.length() - 1));
    
            // Loop through the string from the second last character to the first
            for (int i = s.length() - 2; i >= 0; i--) {
                // If the current character is less than the next character, subtract its value
                if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                    res -= map.get(s.charAt(i));
                } else {
                    // Otherwise, add its value
                    res += map.get(s.charAt(i));
                }
            }
    
            // Return the computed result
            return res;
        }
    }
    //58. Length of Last Word
    public int lengthOfLastWord(String s) {
        s=s.trim();

        int count=0;

        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}
