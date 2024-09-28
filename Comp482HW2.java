public class Comp482HW2 {
        // Function to find the largest element using divide-and-conquer
    public static int findLargest(int[] list, int start, int end) {
        // Base case: If the list has only one element, return that element
        if (start == end) {
            return list[start];
        }

        // Divide the list into two halves
        int mid = (start + end) / 2;

        // Recursively find the largest in both halves
        int maxLeft = findLargest(list, start, mid);
        int maxRight = findLargest(list, mid + 1, end);

        // Compare the largest elements found in both halves and return the larger one
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        // Example list
        int[] list = {3, 41, 52, 26, 38, 57, 9, 49};

        // Find the largest element
        int largest = findLargest(list, 0, list.length - 1);

        // Output the largest element
        System.out.println("The largest element is: " + largest);
    }
    
}
