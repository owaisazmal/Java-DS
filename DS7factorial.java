public class DS7factorial {
    // public static int factorial(int num) {
    // if (num == 0 || num == 1) {
    // return 1;
    // } else {
    // return num * factorial(num-1);
    // }
    // }
    public static void factorial(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {

        factorial(4);
    }

}
