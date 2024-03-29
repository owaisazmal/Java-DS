public class DS17Recursion {
    //A function that calls itself (Example: f(f(x))) = f(x^2)
    public static void printNum(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        printNum(n-1);

    }
    //Print Sum of n num with recursion
    public static void AddSum(int i, int num, int sum){
        if(i == num){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        System.out.println(i);
        AddSum(i+1, num, sum);

    }
    //Print Factorial
    public static int PrintFact(int n1){
        if(n1==1 || n1==0){
            return 1;
        }
        
        int fact_num1 = PrintFact(n1-1);
        int fact_n = n1* fact_num1;
        return fact_n;
    }
    //Fibonacci Sequence
    public static void printFib(int a, int b, int n){
        //a -> second last term
        //b -> last term
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    //Print x^n
    public static int xPowern(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }        

        int xPown1 = xPowern(x, n-1);
        int xPown = x * xPown1;
        return xPown;

    }
    public static void main(String[] args) {
        //int n = 5;
        //printNum(n);
        // AddSum(1, 5, 0);

        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7;
        // printFib(a, b, n-2);

        int ans = xPowern(2, 5);
        System.out.println(ans);
        
    }

}
