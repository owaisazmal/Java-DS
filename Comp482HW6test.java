import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Comp482HW6test {
    //     // A Node represents a state in the BFS tree
    // static class Node {
    //     int level, profit, weight; // level = item index, profit = total profit, weight = total weight
    //     Node parent; // reference to parent node

    //     public Node(int level, int profit, int weight, Node parent) {
    //         this.level = level;
    //         this.profit = profit;
    //         this.weight = weight;
    //         this.parent = parent;
    //     }
    // }

    // // Main function to solve the problem
    // public static void main(String[] args) {
    //     // Items data (profit and weight arrays)
    //     int[] profit = {20, 30, 35, 12, 3}; // profits of items
    //     int[] weight = {2, 5, 7, 3, 1}; // weights of items
    //     int capacity = 13; // max cap of knapsack

    //     // call solveKnapsack
    //     int maxProfit = solveKnapsack(profit, weight, capacity);
    //     System.out.println("Max Profit is: " + maxProfit); // Final result print
    // }

    // // Function to solve 0-1 Knapsack using BFS and branch & bound
    // public static int solveKnapsack(int[] profit, int[] weight, int capacity) {
    //     int n = profit.length; // Total no. of items
    //     Queue<Node> queue = new LinkedList<>(); // Queue for BFS

    //     // Starting with dummy root node
    //     Node root = new Node(-1, 0, 0, null); 
    //     queue.add(root);

    //     int maxProfit = 0; // track maximum profit
        
    //     // BFS loop
    //     while (!queue.isEmpty()) {
    //         Node current = queue.poll(); // Take node from queue

    //         // If we reached last item, stop
    //         if (current.level == n - 1) continue;

    //         // Child node (include next item)
    //         Node include = new Node(current.level + 1,
    //             current.profit + profit[current.level + 1],
    //             current.weight + weight[current.level + 1],
    //             current);

    //         // If valid, add to queue
    //         if (include.weight <= capacity) {
    //             queue.add(include);
    //             maxProfit = Math.max(maxProfit, include.profit); // Update max profit
    //         }

    //         // Child node (exclude next item)
    //         Node exclude = new Node(current.level + 1, current.profit, current.weight, current);
    //         queue.add(exclude);
    //     }

    //     return maxProfit;
    // }
    // static class Node {
    //     int level, profit, weight;
    //     List<Integer> items;

    //     public Node(int level, int profit, int weight, List<Integer> items) {
    //         this.level = level;
    //         this.profit = profit;
    //         this.weight = weight;
    //         this.items = new ArrayList<>(items);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] profit = {20, 30, 35, 12, 3};
    //     int[] weight = {2, 5, 7, 3, 1};
    //     int capacity = 13;

    //     Result result = solveKnapsack(profit, weight, capacity);

    //     System.out.println("Max Profit is: " + result.maxProfit);
    //     System.out.println("Optimal Items: " + result.items);
    // }

    // public static Result solveKnapsack(int[] profit, int[] weight, int capacity) {
    //     int n = profit.length;
    //     Queue<Node> queue = new LinkedList<>();
    //     Node root = new Node(-1, 0, 0, new ArrayList<>());
    //     queue.add(root);

    //     int maxProfit = 0;
    //     List<Integer> optimalItems = new ArrayList<>();

    //     while (!queue.isEmpty()) {
    //         Node current = queue.poll();

    //         if (current.level == n - 1) continue;

    //         Node include = new Node(current.level + 1,
    //             current.profit + profit[current.level + 1],
    //             current.weight + weight[current.level + 1],
    //             current.items);
    //         include.items.add(current.level + 1);

    //         if (include.weight <= capacity) {
    //             queue.add(include);
    //             if (include.profit > maxProfit) {
    //                 maxProfit = include.profit;
    //                 optimalItems = include.items;
    //             }
    //         }

    //         Node exclude = new Node(current.level + 1, current.profit, current.weight, current.items);
    //         queue.add(exclude);
    //     }

    //     return new Result(maxProfit, optimalItems);
    // }

    // static class Result {
    //     int maxProfit;
    //     List<Integer> items;

    //     public Result(int maxProfit, List<Integer> items) {
    //         this.maxProfit = maxProfit;
    //         this.items = items;
    //     }
    // }
    static class Node implements Comparable<Node> {
        int level, profit, weight;
        double bound;
        List<Integer> items;

        public Node(int level, int profit, int weight, double bound, List<Integer> items) {
            this.level = level;
            this.profit = profit;
            this.weight = weight;
            this.bound = bound;
            this.items = new ArrayList<>(items);
        }

        @Override
        public int compareTo(Node other) {
            return Double.compare(other.bound, this.bound);
        }
    }

    public static void main(String[] args) {
        int[] profit = {20, 30, 35, 12, 3};
        int[] weight = {2, 5, 7, 3, 1};
        int capacity = 13;

        Result result = solveKnapsack(profit, weight, capacity);

        System.out.println("Max Profit: " + result.maxProfit);
        System.out.println("Optimal Items: " + result.items);
    }

    public static Result solveKnapsack(int[] profit, int[] weight, int capacity) {
        int n = profit.length;
        PriorityQueue<Node> pq = new PriorityQueue<>();

        Node root = new Node(-1, 0, 0, calculateBound(0, 0, -1, profit, weight, capacity), new ArrayList<>());
        pq.add(root);

        int maxProfit = 0;
        List<Integer> optimalItems = new ArrayList<>();

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.bound <= maxProfit || current.level == n - 1) continue;

            int nextLevel = current.level + 1;

            Node include = new Node(nextLevel,
                current.profit + profit[nextLevel],
                current.weight + weight[nextLevel],
                0,
                current.items);
            include.items.add(nextLevel + 1);

            if (include.weight <= capacity) {
                if (include.profit > maxProfit) {
                    maxProfit = include.profit;
                    optimalItems = include.items;
                }
                include.bound = calculateBound(include.profit, include.weight, nextLevel, profit, weight, capacity);
                if (include.bound > maxProfit) {
                    pq.add(include);
                }
            }

            Node exclude = new Node(nextLevel,
                current.profit,
                current.weight,
                calculateBound(current.profit, current.weight, nextLevel, profit, weight, capacity),
                current.items);

            if (exclude.bound > maxProfit) {
                pq.add(exclude);
            }
        }

        return new Result(maxProfit, optimalItems);
    }

    private static double calculateBound(int profit, int weight, int level, int[] profitArray, int[] weightArray, int capacity) {
        if (weight > capacity) return 0;

        double bound = profit;
        int remainingWeight = capacity - weight;

        for (int i = level + 1; i < profitArray.length; i++) {
            if (weightArray[i] <= remainingWeight) {
                remainingWeight -= weightArray[i];
                bound += profitArray[i];
            } else {
                bound += profitArray[i] * ((double) remainingWeight / weightArray[i]);
                break;
            }
        }
        return bound;
    }

    static class Result {
        int maxProfit;
        List<Integer> items;

        public Result(int maxProfit, List<Integer> items) {
            this.maxProfit = maxProfit;
            this.items = items;
        }
    }
}
