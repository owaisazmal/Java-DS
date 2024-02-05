public class paterns {
    public static void main(String[] args) {

        int n,m, number;
        n = 4;
        m = 5;
        number = 1;

    // Rectangle
    //     for (int i = 1; i <= n; i++){
    //         for (int j = 1; j <= m; j++){
    //             System.err.print("*");
    //         }
    //         System.out.println();
    //     }

    // HollowRectangle
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= m; j++){
        //         if(i == 1 || j == 1 || i == n || j == m){
        //         System.out.print("*");
        //     }else{
        //         System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        // }
    //Half Pyramid
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
    //Half Pyramid (Opposite)
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //Half Pyramid (180deg)
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //         //inner loop -> star point
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        // }

    //Print the Patern
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }
    //Print the Patern inverted
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= (n-i+1); j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
    //Floyd's Triangle
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <=i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

    //01 triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0)
                System.out.print("1 ");
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
