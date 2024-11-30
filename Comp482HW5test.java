import java.util.ArrayList;
import java.util.List;

public class Comp482HW5test {
    // Entry point
    public static void main(String[] args) {
        System.out.println("Results for n = 6:");
        getQueensSolutions(6, 2);

        System.out.println("\nResults for n = 7:");
        getQueensSolutions(7, 2);
    }

    // Find and display solutions
    public static void getQueensSolutions(int boardSize, int maxSolutions) {
        List<List<Integer>> results = new ArrayList<>();
        searchSolutions(boardSize, 0, new int[boardSize], results);

        // Display only the first 'maxSolutions'
        for (int idx = 0; idx < Math.min(maxSolutions, results.size()); idx++) {
            System.out.println("Configuration " + (idx + 1) + ": " + results.get(idx));
        }
    }

    // Backtracking logic
    private static void searchSolutions(int size, int currentRow, int[] positions, List<List<Integer>> results) {
        if (currentRow == size) {
            // Store valid configuration
            List<Integer> solution = new ArrayList<>();
            for (int pos : positions) {
                solution.add(pos);
            }
            results.add(solution);
            return;
        }

        for (int col = 0; col < size; col++) {
            if (isPositionSafe(positions, currentRow, col)) {
                positions[currentRow] = col;
                searchSolutions(size, currentRow + 1, positions, results);
            }
        }
    }

    // Check for conflicts
    private static boolean isPositionSafe(int[] positions, int row, int col) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousCol = positions[previousRow];
            if (previousCol == col || Math.abs(previousCol - col) == Math.abs(previousRow - row)) {
                return false;
            }
        }
        return true;
    }
}
