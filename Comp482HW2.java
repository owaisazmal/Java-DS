import java.util.Arrays;

public class Comp482HW2 {
    //     // Function to find the largest element using divide-and-conquer
    // public static int findLargest(int[] list, int start, int end) {
    //     // Base case: If the list has only one element, return that element
    //     if (start == end) {
    //         return list[start];
    //     }

    //     // Divide the list into two halves
    //     int mid = (start + end) / 2;

    //     // Recursively find the largest in both halves
    //     int maxLeft = findLargest(list, start, mid);
    //     int maxRight = findLargest(list, mid + 1, end);

    //     // Compare the largest elements found in both halves and return the larger one
    //     return Math.max(maxLeft, maxRight);
    // }

    // public static void main(String[] args) {
    //     // Example list
    //     int[] list = {3, 41, 52, 26, 38, 57, 9, 49};

    //     // Find the largest element
    //     int largest = findLargest(list, 0, list.length - 1);

    //     // Output the largest element
    //     System.out.println("The largest element is: " + largest);
    // }

    // Merge Sort function
    // public static void mergeSort(int[] array, int left, int right) {
    //     if (left < right) {
    //         int middle = (left + right) / 2;
            
    //         // Recursively sort first and second halves
    //         mergeSort(array, left, middle);
    //         mergeSort(array, middle + 1, right);
            
    //         // Merge the sorted halves
    //         merge(array, left, middle, right);
    //     }
    // }

    // // Merge function to merge two sorted subarrays
    // public static void merge(int[] array, int left, int middle, int right) {
    //     int n1 = middle - left + 1;
    //     int n2 = right - middle;

    //     // Temporary arrays
    //     int[] leftArray = new int[n1];
    //     int[] rightArray = new int[n2];

    //     // Copy data to temp arrays
    //     for (int i = 0; i < n1; i++) leftArray[i] = array[left + i];
    //     for (int i = 0; i < n2; i++) rightArray[i] = array[middle + 1 + i];

    //     // Merge the temp arrays back into the original array
    //     int i = 0, j = 0, k = left;
    //     while (i < n1 && j < n2) {
    //         if (leftArray[i] <= rightArray[j]) {
    //             array[k] = leftArray[i];
    //             i++;
    //         } else {
    //             array[k] = rightArray[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     // Copy remaining elements of leftArray[] if any
    //     while (i < n1) {
    //         array[k] = leftArray[i];
    //         i++;
    //         k++;
    //     }

    //     // Copy remaining elements of rightArray[] if any
    //     while (j < n2) {
    //         array[k] = rightArray[j];
    //         j++;
    //         k++;
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] array = {123, 34, 189, 56, 150, 12, 9, 240};
        
    //     // Call the mergeSort function
    //     mergeSort(array, 0, array.length - 1);
        
    //     // Print sorted array
    //     for (int num : array) {
    //         System.out.print(num + " ");
    //     }
    // }
    //**************************Q34************************ */
    // Implementing Exchange Sort
    // public static void exchangeSort(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] < arr[i]) {
    //                 // Swap arr[i] and arr[j]
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    // // Implementing Quicksort
    // public static void quicksort(int[] arr, int low, int high) {
    //     if (low < high) {
    //         int pivotIndex = partition(arr, low, high);
    //         quicksort(arr, low, pivotIndex - 1);
    //         quicksort(arr, pivotIndex + 1, high);
    //     }
    // }

    // private static int partition(int[] arr, int low, int high) {
    //     int pivot = arr[high];
    //     int i = (low - 1);
    //     for (int j = low; j < high; j++) {
    //         if (arr[j] < pivot) {
    //             i++;
    //             // Swap arr[i] and arr[j]
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     // Swap arr[i + 1] and arr[high] (or pivot)
    //     int temp = arr[i + 1];
    //     arr[i + 1] = arr[high];
    //     arr[high] = temp;
    //     return i + 1;
    // }

    // // Function to generate random lists
    // public static int[] generateRandomList(int n) {
    //     Random rand = new Random();
    //     int[] arr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = rand.nextInt(10000); // Generate a random number
    //     }
    //     return arr;
    // }

    // // Timing the algorithms
    // public static long timeAlgorithm(Runnable sortFunction, int[] arr) {
    //     long startTime = System.nanoTime();
    //     sortFunction.run();
    //     long endTime = System.nanoTime();
    //     return endTime - startTime;
    // }

    // public static void main(String[] args) {
    //     int[] listSizes = {100, 200, 300, 400, 500}; // Different sizes of lists to test
    //     for (int n : listSizes) {
    //         int[] randomList = generateRandomList(n);

    //         // Timing Exchange Sort
    //         int[] unsortedListForExchange = randomList.clone();
    //         long exchangeTime = timeAlgorithm(() -> exchangeSort(unsortedListForExchange), unsortedListForExchange);

    //         // Timing Quicksort
    //         int[] unsortedListForQuick = randomList.clone();
    //         long quicksortTime = timeAlgorithm(() -> quicksort(unsortedListForQuick, 0, unsortedListForQuick.length - 1), unsortedListForQuick);

    //         System.out.printf("List Size: %d\n", n);
    //         System.out.printf("Exchange Sort Time: %.6f seconds\n", exchangeTime / 1_000_000_000.0);
    //         System.out.printf("Quicksort Time: %.6f seconds\n\n", quicksortTime / 1_000_000_000.0);
    //     }
    // }
        //**************************Q40************************ */
    // public class Sorted2DArraySearch {

    //     public static int[] searchInSorted2DArray(int[][] table, int target) {
    //         if (table == null || table.length == 0 || table[0].length == 0) {
    //             return null;  // Table is empty
    //         }
    
    //         int n = table.length;       // Number of rows
    //         int m = table[0].length;    // Number of columns
    //         int row = 0;
    //         int col = m - 1;  // Start from the top-right corner
    
    //         while (row < n && col >= 0) {
    //             int currentElement = table[row][col];
    //             if (currentElement == target) {
    //                 return new int[] { row, col };  // Target found
    //             } else if (currentElement < target) {
    //                 row++;  // Move down
    //             } else {
    //                 col--;  // Move left
    //             }
    //         }
    
    //         return null;  // Target not found
    //     }
    
    //     public static void main(String[] args) {
    //         int[][] table = {
    //             {10, 20, 30, 40},
    //             {15, 25, 35, 45},
    //             {27, 29, 37, 48},
    //             {30, 32, 38, 50}
    //         };
    
    //         int target = 29;
    //         int[] result = searchInSorted2DArray(table, target);
    //         if (result != null) {
    //             System.out.println("Target " + target + " found at position: (" + result[0] + ", " + result[1] + ")");
    //         } else {
    //             System.out.println("Target " + target + " not found in the table.");
    //         }
    //     }
    // }

    // public class BinomialCoefficient {

    //     public static int binomialCoeff(int n, int k) {
    //         int[] C = new int[k + 1];
    
    //         C[0] = 1;
    
    //         // Build the array from the bottom up as discussed in the class
    //         for (int i = 1; i <= n; i++) {
    //             for (int j = Math.min(i, k); j > 0; j--) {
    //                 // C[j] = C[j] + C[j-1]
    //                 C[j] = C[j] + C[j - 1];
    //             }
    //         }
    
    //         return C[k];
    //     }
    
    //     public static void main(String[] args) {
    //         int n = 5, k = 2;
    //         System.out.println("Value of C(" + n + ", " + k + ") is " + binomialCoeff(n, k));
    //     }
    // }
    public class FloydWarshallAlgorithm {
        final static int INF = 99999;
    
        public static void floydWarshall(int graph[][]) {
            int vertices = graph.length;
            int dist[][] = new int[vertices][vertices];
    
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    dist[i][j] = graph[i][j];
                }
            }
    
            for (int k = 0; k < vertices; k++) {
                for (int i = 0; i < vertices; i++) {
                    for (int j = 0; j < vertices; j++) {
                        if (dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
    
            printSolution(dist);
        }
    
        public static void printSolution(int dist[][]) {
            System.out.println("Following matrix shows the shortest distances between every pair of vertices:");
            for (int i = 0; i < dist.length; i++) {
                for (int j = 0; j < dist.length; j++) {
                    if (dist[i][j] == INF) {
                        System.out.print("INF ");
                    } else {
                        System.out.print(dist[i][j] + "   ");
                    }
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int graph[][] = { {0, 5, INF, 10},
                              {INF, 0, 3, INF},
                              {INF, INF, 0, 1},
                              {INF, INF, INF, 0}
                            };
            floydWarshall(graph);
        }
    }

    public static double maxSubArraySum(double[] array) {
        double maxSoFar = array[0];
        double maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

        public static int minTourCost(int[][] distance) {
        int n = distance.length;
        int[][] dp = new int[1 << n][n];
        for (int[] d : dp) {
            Arrays.fill(d, INF);
        }
        dp[1][0] = 0; // Start from the first city with only the first city visited

        for (int mask = 1; mask < (1 << n); mask += 2) {
            for (int u = 1; u < n; u++) {
                if ((mask & (1 << u)) != 0) {
                    for (int v = 0; v < n; v++) {
                        if ((mask & (1 << v)) != 0 && distance[v][u] != INF) {
                            int newMask = mask ^ (1 << u);
                            dp[mask][u] = Math.min(dp[mask][u], dp[newMask][v] + distance[v][u]);
                        }
                    }
                }
            }
        }

        int minCost = INF;
        for (int i = 1; i < n; i++) {
            if (distance[i][0] != INF) {
                minCost = Math.min(minCost, dp[(1 << n) - 1][i] + distance[i][0]);
            }
        }
        return minCost;
    }

    
        
}
