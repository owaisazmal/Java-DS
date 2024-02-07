public class AdvancedPatern {
    public static void main(String[] args) {
        int n, m;
        n = 4;
        m = 5;
        // Butterfly Patern

        // // Upper half
        // for (int i = 1; i <= m; i++) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // spaces
        // int space = 2 * (m - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // // second part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Lower Half
        // for (int i = m; i >= 1; i--) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // spaces
        // int space = 2 * (m - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // // second part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Solid Rhombus
        // for (int i = 1; i <= m; i++) {
        // int space = m - i;
        // for(int j = 0; j < space; j++){
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= m; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // Number pyramid
        // for (int i = 1; i <= m; i++) {
        // // spaces
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Palindromic Patern
        // for (int i = 1; i <= m; i++) {
        // // spaces
        // for (int j = 0; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // First Half Numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // // Second Half Numbers
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Diamond Patern
        // Upper half
        for (int i = 1; i <= m; i++) {
            // Space
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            // Space
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
