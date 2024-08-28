public class DS31Recursion {
    public static void main(String[] args) {    
    walk(5);
}

public static void walk(int steps){
    if(steps < 1) return; //base case
    System.out.println("You took a step");
    walk(steps -1);    //recursive case 
    
    }
}

