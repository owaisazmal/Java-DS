import java.util.Stack;

public class DS36Runtime {
    //test from cursor
    public static void main(String[] args) throws InterruptedException{
        long start = System.nanoTime();

        // ---------------Sample program ----------------------

       Stack <String> stack = new Stack <String>();

        System.out.println(stack.empty());
        
        stack.push("apple");
        stack.push("samsung");
        stack.push("volvo");
        stack.push("honda");
        stack.push("Nvidia");
        
        System.out.println(stack.empty());
        System.out.println(stack);
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println(stack);

        String myFavThing = stack.peek();
        System.out.println(myFavThing);

        System.out.println(stack.search("apple"));

        // ---------------Sample program ----------------------

        long duration = (System.nanoTime() - start)/10000;
        System.out.println(duration + "ms");
    }
}
