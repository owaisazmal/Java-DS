import java.util.ArrayList;
import java.util.List;

public class Comp482HW5test {
    // Entry point
    // public static void main(String[] args) {
    //     System.out.println("Results for n = 6:");
    //     getQueensSolutions(6, 2);

    //     System.out.println("\nResults for n = 7:");
    //     getQueensSolutions(7, 2);
    // }

    // // Find and display solutions
    // public static void getQueensSolutions(int boardSize, int maxSolutions) {
    //     List<List<Integer>> results = new ArrayList<>();
    //     searchSolutions(boardSize, 0, new int[boardSize], results);

    //     // Display only the first 'maxSolutions'
    //     for (int idx = 0; idx < Math.min(maxSolutions, results.size()); idx++) {
    //         System.out.println("Configuration " + (idx + 1) + ": " + results.get(idx));
    //     }
    // }

    // // Backtracking logic
    // private static void searchSolutions(int size, int currentRow, int[] positions, List<List<Integer>> results) {
    //     if (currentRow == size) {
    //         // Store valid configuration
    //         List<Integer> solution = new ArrayList<>();
    //         for (int pos : positions) {
    //             solution.add(pos);
    //         }
    //         results.add(solution);
    //         return;
    //     }

    //     for (int col = 0; col < size; col++) {
    //         if (isPositionSafe(positions, currentRow, col)) {
    //             positions[currentRow] = col;
    //             searchSolutions(size, currentRow + 1, positions, results);
    //         }
    //     }
    // }

    // // Check for conflicts
    // private static boolean isPositionSafe(int[] positions, int row, int col) {
    //     for (int previousRow = 0; previousRow < row; previousRow++) {
    //         int previousCol = positions[previousRow];
    //         if (previousCol == col || Math.abs(previousCol - col) == Math.abs(previousRow - row)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
        
    //     int boardSize = 8;
        
    //     List<List<Integer>> results = solveNQueens(boardSize);

    //     System.out.println("Number of solutions for n = " + boardSize + ": " + results.size());
    //     for (List<Integer> arrangement : results) {
    //         System.out.println(arrangement);
    //     }
    // }

    // // Primary method to solve the problem
    // public static List<List<Integer>> solveNQueens(int n) {
    //     List<List<Integer>> solutions = new ArrayList<>();
    //     placeQueens(n, new ArrayList<>(), solutions);
    //     return solutions;
    // }

    // // Recursive method to place queens row by row
    // private static void placeQueens(int n, List<Integer> currentConfig, List<List<Integer>> solutions) {
    //     // If the configuration is complete, add it to the solutions list
    //     if (currentConfig.size() == n) {
    //         solutions.add(new ArrayList<>(currentConfig));
    //         return;
    //     }

    //     // Iterate through all columns in the current row
    //     for (int col = 0; col < n; col++) {
    //         if (isPositionValid(currentConfig, col)) {
    //             // Expand the current configuration
    //             currentConfig.add(col);

    //             // Recurse to the next row
    //             placeQueens(n, currentConfig, solutions);

    //             // Backtrack by removing the last queen
    //             currentConfig.remove(currentConfig.size() - 1);
    //         }
    //     }
    // }

    // // Method to validate the safety of the current position
    // private static boolean isPositionValid(List<Integer> config, int col) {
    //     int currentRow = config.size();
    //     for (int row = 0; row < currentRow; row++) {
    //         int existingCol = config.get(row);

    //         // Check for column conflict
    //         if (existingCol == col) {
    //             return false;
    //         }

    //         // Check for diagonal conflicts
    //         if (Math.abs(existingCol - col) == Math.abs(row - currentRow)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     // Define the weights and the target sum
    //     int[] weights = {2, 10, 13, 17, 22, 42};
    //     int targetSum = 52;

    //     // Find and print all combinations
    //     List<List<Integer>> solutions = findSubsets(weights, targetSum);
    //     System.out.println("Combinations that sum to " + targetSum + ":");
    //     for (List<Integer> solution : solutions) {
    //         System.out.println(solution);
    //     }
    // }

    // // Finds all subsets that sum to the target value
    // public static List<List<Integer>> findSubsets(int[] weights, int targetSum) {
    //     List<List<Integer>> solutions = new ArrayList<>();
    //     findCombinations(weights, 0, targetSum, new ArrayList<>(), solutions);
    //     return solutions;
    // }

    // // Recursive method to find subsets
    // private static void findCombinations(int[] weights, int index, int remainingSum, List<Integer> current, List<List<Integer>> solutions) {
    //     if (remainingSum == 0) {
    //         solutions.add(new ArrayList<>(current));
    //         return;
    //     }

    //     if (index >= weights.length || remainingSum < 0) {
    //         return;
    //     }

    //     // Include the current weight
    //     current.add(weights[index]);
    //     findCombinations(weights, index + 1, remainingSum - weights[index], current, solutions);

    //     // Exclude the current weight (backtrack)
    //     current.remove(current.size() - 1);
    //     findCombinations(weights, index + 1, remainingSum, current, solutions);
    // }
    // public static void main(String[] args) {
    //     int[] boardSizes = {4, 8, 10, 12};
    //     for (int n : boardSizes) {
    //         System.out.println("n = " + n);
    //         List<List<Integer>> solutions = solveNQueens(n);
    //         System.out.println("Solutions: " + solutions.size());
    //     }
    // }

    // public static List<List<Integer>> solveNQueens(int n) {
    //     List<List<Integer>> solutions = new ArrayList<>();
    //     int[] board = new int[n];
    //     placeQueen(board, 0, solutions);
    //     return solutions;
    // }
    // private static void placeQueen(int[] board, int row, List<List<Integer>> solutions) {
    //     int n = board.length;
    //     if (row == n) {
    //         solutions.add(convertBoardToSolution(board));
    //         return;
    //     }
    //     for (int col = 0; col < n; col++) {
    //         if (isSafe(board, row, col)) {
    //             board[row] = col;
    //             placeQueen(board, row + 1, solutions);
    //         }
    //     }
    // }
    // private static boolean isSafe(int[] board, int row, int col) {
    //     for (int prevRow = 0; prevRow < row; prevRow++) {
    //         int prevCol = board[prevRow];
    //         if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // private static List<Integer> convertBoardToSolution(int[] board) {
    //     List<Integer> solution = new ArrayList<>();
    //     for (int col : board) {
    //         solution.add(col + 1);
    //     }
    //     return solution;
    // }
    public static void main(String[] args) {
        int[] weights = {2, 10, 13, 17, 22, 42};
        int targetSum = 52;
        List<Integer> solution = findSingleSubset(weights, targetSum);
        if (solution.isEmpty()) {
            System.out.println("No solution found.");
        } else {
            System.out.println("One solution: " + solution);
        }
    }
    public static List<Integer> findSingleSubset(int[] weights, int targetSum) {
        List<Integer> solution = new ArrayList<>();
        if (findSubset(weights, 0, targetSum, new ArrayList<>(), solution)) {
            return solution;
        }
        return solution;
    }
    private static boolean findSubset(int[] weights, int index, int remainingSum, List<Integer> current, List<Integer> solution) {
        if (remainingSum == 0) {
            solution.addAll(current);
            return true;
        }
        if (index >= weights.length || remainingSum < 0) return false;
        current.add(weights[index]);
        if (findSubset(weights, index + 1, remainingSum - weights[index], current, solution)) return true;
        current.remove(current.size() - 1);
        if (findSubset(weights, index + 1, remainingSum, current, solution)) {
            return true;
        }
        return false;
    }
}
