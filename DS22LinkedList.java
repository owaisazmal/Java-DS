import java.util.LinkedList;

public class DS22LinkedList {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList <String>();

        linkedList.push(" ");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        
        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");
        linkedList.offer("e");

        linkedList.add(6, "Added");
        linkedList.remove("E");
        System.out.println(linkedList);

        System.out.println("Index of a is " + linkedList.indexOf("a") );

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("10");

        System.out.println(linkedList);
    }
}
