public class DS31Recursion {
    public static void main(String[] args) {    
    walk(5);
    System.out.println(factorial(7));
    System.out.println(power(2, 4));
}
//simple one to remember
    public static void walk(int steps){
        if(steps < 1) return; //base case
        System.out.println("You took a step");
        walk(steps -1);    //recursive case 
    }

    public static int factorial(int num){
        if(num < 1) return 1; //base case
        return num * factorial(num-1);
    }

    public static int power(int num, int pow){
        if(pow < 1) return 1; //base case
        return num * power(num, pow-1);
    }
}



