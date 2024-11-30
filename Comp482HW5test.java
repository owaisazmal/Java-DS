import java.util.ArrayList;
import java.util.List;

public class Comp482HW5test {
    // Main method
    public static void main(String[] args) {
        System.out.println("Solutions for n = 6:");
        findNQueensSolutions(6, 2); // Find first 2 solutions for n = 6

        System.out.println("\nSolutions for n = 7:");
        findNQueensSolutions(7, 2); // Find first 2 solutions for n = 7
    }

    // Method to find and print solutions for n-Queens
    public static void findNQueensSolutions(int n, int numSolutions) {
        List<List<Integer>> solutions = new ArrayList<>();
        solveNQueens(n, 0, new int[n], solutions);

        // Print the first numSolutions solutions
        for (int i = 0; i < Math.min(numSolutions, solutions.size()); i++) {
            System.out.println("Solution " + (i + 1) + ": " + solutions.get(i));
        }
    }

    // Recursive method to solve n-Queens using backtracking
    private static void solveNQueens(int n, int row, int[] positions, List<List<Integer>> solutions) {
        if (row == n) {
            // Add current solution to the list
            List<Integer> solution = new ArrayList<>();
            for (int col : positions) {
                solution.add(col);
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(positions, row, col)) {
                positions[row] = col;
                solveNQueens(n, row + 1, positions, solutions);
            }
        }
    }

    // Check if placing a queen at (row, col) is valid
    private static boolean isValid(int[] positions, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check column and diagonal conflicts
            if (positions[i] == col || Math.abs(positions[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
