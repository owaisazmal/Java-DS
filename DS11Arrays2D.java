import java.util.Scanner;

public class DS11Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] num = new int[rows][col];

        for(int i = 0; i<rows; i++){
            for(int j=0; j<col; j++){
                num[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

/*Qs. Take a matrix as input from the user. Search for a
given number x and print the indices at which it occurs. */
        System.out.println("Enter the value you want to find");
        int x = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(num[i][j] == x){
                    System.out.println("x found at location: " + i + ", " + j);
                }
            }
        }

    }
}
