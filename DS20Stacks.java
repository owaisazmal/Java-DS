import java.util.Stack;

public class DS20Stacks {
    public static void main(String[] args) {
        
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
    }
}
