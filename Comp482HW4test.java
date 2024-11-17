import java.util.*;
public class Comp482HW4test {
    static class Edge {
        int source, destination, weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge>[] adjacencyList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        void addEdge(int source, int destination, int weight) {
            adjacencyList[source].add(new Edge(source, destination, weight));
            adjacencyList[destination].add(new Edge(destination, source, weight));
        }
    }

    public static void primMST(Graph graph) {
        boolean[] inMST = new boolean[graph.vertices];
        int[] key = new int[graph.vertices];
        int[] parent = new int[graph.vertices];
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        pq.add(new Edge(-1, 0, 0)); // Starting from node 0

        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll();
            int currentVertex = currentEdge.destination;

            if (inMST[currentVertex]) continue;

            inMST[currentVertex] = true;

            for (Edge edge : graph.adjacencyList[currentVertex]) {
                int dest = edge.destination;
                if (!inMST[dest] && edge.weight < key[dest]) {
                    key[dest] = edge.weight;
                    parent[dest] = currentVertex;
                    pq.add(new Edge(currentVertex, dest, edge.weight));
                }
            }
        }

        // Print the MST
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.vertices; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + key[i]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        System.out.println("Prim's Minimum Spanning Tree:");
        primMST(graph);
    }

    public class Knapsack {

        public static int knapsack(int[] weights, int[] values, int capacity) {
            int n = weights.length; 

    
            // to stor the maximum value at each weight
            int[][] dp = new int[n + 1][capacity + 1];
    
            // Build the dp table iteratively
            for (int i = 1; i <= n; i++) {
                for (int w = 0; w <= capacity; w++) {
                    if (weights[i - 1] <= w) {
                        // Include the item or exclude it, take the max
                        dp[i][w] = Math.max(dp[i - 1][w], values[i - 1] + dp[i - 1][w - weights[i - 1]]);
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }
            return dp[n][capacity]; //return
        }
    
        // Main function to test the algorithm
        public static void main(String[] args) {
            int[] weights = {1, 3, 4, 5}; // Weights of the items
            int[] values = {1, 4, 5, 7};  // Values of the items
            int capacity = 7;            // Capacity of the knapsack
    
            int maxProfit = knapsack(weights, values, capacity);
            System.out.println("Maximum profit: " + maxProfit);
        }
    }
    public static int minimizeCost(int[][] cost) {
        int n = cost.length; 
        boolean[] assignedJobs = new boolean[n]; 
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            int jobIndex = -1;

            // Find the job with the min. cost for persn i
            for (int j = 0; j < n; j++) {
                if (!assignedJobs[j] && cost[i][j] < minCost) {
                    minCost = cost[i][j];
                    jobIndex = j;
                }
            }

            // Assigned the job and add the cost
            assignedJobs[jobIndex] = true;
            totalCost += minCost;
        }

        return totalCost; //return tot. cst
    }    
    
}
