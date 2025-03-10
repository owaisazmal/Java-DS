public class Comp482HW4 {

    //This modified version uses only a one-dimensional array to store the intermediate results, 
    //reducing space complexity to O(k).
    public class BinomialCoefficient {
        public static int binomialCoefficient(int n, int k) {
            if (k > n) return 0;
            int[] dp = new int[k + 1];
            dp[0] = 1; // C(n, 0) = 1
    
            for (int i = 1; i <= n; i++) {
                for (int j = Math.min(i, k); j > 0; j--) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
            return dp[k];
        }
    
        public static void main(String[] args) {
            int n = 5, k = 2;
            System.out.println("C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
        }
    }

    //This code iteratively updates matrices D and P to find the shortest paths between all pairs of vertices.
    public class FloydAlgorithm {
        final static int INF = 99999;
    
        public static void floydWarshall(int[][] graph) {
            int V = graph.length;
            int[][] D = new int[V][V];
            int[][] P = new int[V][V];
    
            // Initialize matrices D and P
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    D[i][j] = graph[i][j];
                    P[i][j] = (graph[i][j] != INF && i != j) ? i : -1;
                }
            }
    
            // Update matrices according to Floyd-Warshall algorithm
            for (int k = 0; k < V; k++) {
                for (int i = 0; i < V; i++) {
                    for (int j = 0; j < V; j++) {
                        if (D[i][k] + D[k][j] < D[i][j]) {
                            D[i][j] = D[i][k] + D[k][j];
                            P[i][j] = k;
                        }
                    }
                }
            }
    
            printMatrix(D, "D (Shortest Path Lengths)");
            printMatrix(P, "P (Intermediate Vertices)");
        }
    
        private static void printMatrix(int[][] matrix, String label) {
            System.out.println(label + ":");
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print((value == INF ? "INF" : value) + "\t");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int[][] graph = {
                {0, 3, INF, 5},
                {2, 0, INF, 4},
                {INF, 1, 0, INF},
                {INF, INF, 2, 0}
            };
            floydWarshall(graph);
        }
    }

    public class OptimalBST {
        public static double optimalBST(double[] p, double[] q, int n) {
            double[][] e = new double[n + 2][n + 1];
            double[][] w = new double[n + 2][n + 1];
            int[][] root = new int[n + 1][n + 1];
    
            for (int i = 1; i <= n + 1; i++) {
                e[i][i - 1] = q[i - 1];
                w[i][i - 1] = q[i - 1];
            }
    
            for (int l = 1; l <= n; l++) {
                for (int i = 1; i <= n - l + 1; i++) {
                    int j = i + l - 1;
                    e[i][j] = Double.MAX_VALUE;
                    w[i][j] = w[i][j - 1] + p[j] + q[j];
    
                    for (int r = i; r <= j; r++) {
                        double t = e[i][r - 1] + e[r + 1][j] + w[i][j];
                        if (t < e[i][j]) {
                            e[i][j] = t;
                            root[i][j] = r;
                        }
                    }
                }
            }
    
            System.out.println("Optimal Cost: " + e[1][n]);
            return e[1][n];
        }
    
        public static void main(String[] args) {
            double[] p = {0, 0.15, 0.10, 0.05, 0.10, 0.20}; // Insert a 0 at index 0
            double[] q = {0.05, 0.10, 0.05, 0.05, 0.05, 0.10}; // Insert a 0 at index 0
            int n = p.length - 1;
            optimalBST(p, q, n);
        }
    }
    
    
    
}
