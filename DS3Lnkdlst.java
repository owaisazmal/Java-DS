import java.util.Arrays;
import java.util.LinkedList;

public class DS3Lnkdlst {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(300);
        list.removeLast();
        // System.out.println(list);
        // System.out.println(list.contains(10));
        // System.out.println(list.size());
        // System.out.println(list.indexOf(10));

        //Convert
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
