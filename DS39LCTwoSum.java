import java.lang.classfile.components.ClassPrinter.ListNode;
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
        
        for(int i = digits.length-1;i >= 0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length +1];
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
        int l = 0, maxArea = 0;
        int r = height.length - 1;

        while (l < r) {
            // Calculate the area with the current left and right pointers
            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line inward
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
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
    //383. Ransom Note
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        HashMap<Character, Integer> counts = new HashMap<>();

        // Populate the hashmap with character counts from magazine
        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) <= 0) {
                return false;
            }
            counts.put(c, counts.get(c) - 1);
        }

        return true;
    }
    //205. Isomorphic Strings    
    public boolean isIsomorphic(String s, String t) {
        //if(s.length() != t.length) return false;
        HashMap<Character, Character> map1 = new HashMap<Character, Character>(); //s -> t
        

        for(int i = 0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                if(!map1.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                } 
            }else{
                if(map1.containsValue(t.charAt(i))){
                    return false;
                }
                map1.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    //290 Word Pattern
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);

            if (map.containsValue(arr[i]) && !containsKey) {
                return false;
            }

            if (containsKey && !map.get(ch).equals(arr[i])) {
                return false;
            } else if (!containsKey) {
                map.put(ch, arr[i]);
            }
        }

        return true; 
    }
    //Two sum with Hash Map
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
    //202. Happy Number
    public boolean isHappy(int n) {
        Set<Integer> seenNumber = new HashSet<>();
        int sum = 0;

        while(sum != 1 && !seenNumber.contains(sum)){
            seenNumber.add(sum);
            sum = 0;

            while(n!=0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            
            n = sum;
        }
        return sum == 1;
    }
    //228. Summary Ranges
    public List<String> summaryRanges(int[] nums) {
        LinkedList<String> result = new LinkedList<>();
        int n = nums.length;

        if(n == 0) return result;

        int a = nums[0];
        for(int i = 0; i<n; i++){
            if(i == n-1 || nums[i]+1 != nums[i+1]){
                if(nums[i] != a) result.add(a + "->" + nums[i]);
                else result.add(a + "");
                if(i != n-1) a=nums[i+1];
            }
        }
        return result;

    }
    //69. Sqrt(x)
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        int left = 1, right = x, ans = 0;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(mid <= x / mid){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    //50. Pow(x, n)
    private double binaryExp(double x, long n){
        if(n == 0){
            return 1.0;
        }
        if(n < 0){
            return 1.0 / binaryExp(x, -n);
        }

        if(n%2 == 1){
            return x * binaryExp(x * x, (n-1) / 2);
    
        }else{
            return binaryExp(x * x, n / 2);
        }
    }
    //9. Palindrome Number
    public boolean isPalindrome(int x) {
        
        String xStr = String.valueOf(x);
        for(int i = 0; i < xStr.length()/2; i++){
            int num1 = xStr.charAt(i);
            int num2 = xStr.charAt(xStr.length()- i-1);

            if(num1 != num2){
                return false;
            }
        }

        return true;
    }
    //20. Valid Parentheses
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //189. Rotate Array
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Adjust k to avoid unnecessary rotations
        reverse(nums, 0, n - 1);    // Reverse the entire array
        reverse(nums, 0, k - 1);    // Reverse the first part of the array
        reverse(nums, k, n - 1);    // Reverse the remaining part of the array
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    //. Merge Two Sorted Lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null){
            return list2;
        }return list1;
    }

    //122. Best Time to Buy and Sell Stock II
        public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    //55. Jump Game
    public boolean canJump(int[] nums) {
        int furthest = 0;
        for(int i = 0; i<nums.length; i++){
            if(i>furthest){
                return false;
            }
            furthest = Math.max(furthest, i + nums[i]);

            if(furthest >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
    //274. H-Index
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int hindex=0;

        for(int i = 0; i<n; i++){
           int h = n-i;
           if(citations[i] >= h){
               hindex = h;
               break;
           }
        }
        return hindex;
   }
   //167. Two Sum II - Input Array Is Sorted -med
   public int[] twoSum(int[] numbers, int target) {
    int n = numbers.length;
    int l = 0, r = n-1;
    while(l<r){
        if(numbers[l] + numbers[r] == target) break;
        else if(numbers[l] + numbers[r] > target) r-=1;
        else l+=1;
    }
    return new int[] {l+1, r+1};
    }

    //15. 3sum
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to use two-pointer technique
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for the first element in the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;      // Left pointer
            int l = n - 1;      // Right pointer

            while (j < l) {
                int sum = nums[i] + nums[j] + nums[l];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[l]));

                    // Skip duplicates for the second element
                    while (j < l && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    // Skip duplicates for the third element
                    while (j < l && nums[l] == nums[l - 1]) {
                        l--;
                    }

                    // Move both pointers after finding a valid triplet
                    j++;
                    l--;
                } else if (sum < 0) {
                    j++;  // Need a larger sum, move left pointer right
                } else {
                    l--;  // Need a smaller sum, move right pointer left
                }
            }
        }

        return ans;
    }
    //238. Product of Array Except Self
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left_product = new int[n];
        int[] right_product = new int[n];
        int[] output_arr = new int[n];

        left_product[0] = 1;
        right_product[n-1] = 1;

        for(int i = 1; i<n; i++){
            left_product[i] = nums[i-1] * left_product[i-1];
        }

        for(int i = n-2; i>=0; i--){
            right_product[i] = nums[i+1] * right_product[i+1];
        }

        for(int i= 0; i<n; i++){
            output_arr[i] = left_product[i] * right_product[i];
        }

        return output_arr;
    }
    //141. Linked List Cycle
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //49. Group Anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26]; // Count array for 26 lowercase letters
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append('#'); // Separator to differentiate numbers
                sb.append(i);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    //12. Integer to Roman
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<values.length; i++){
            if(num == 0) break;// If the number becomes 0, we can stop as the conversion is complete.

            while(num >= values[i]){
                sb.append(symbols[i]);
                num -= values[i];

            }
        }
        return sb.toString();
    }

    //380. Insert Delete GetRandom O(1)
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val) {
        return map.containsKey(val);
    }

    public boolean insert(int val) {
        if (search(val)) return false;

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!search(val)) return false;

        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
