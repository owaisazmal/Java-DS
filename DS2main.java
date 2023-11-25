import java.util.*;

public class DS2main {
    public static void main(String[] args) {
        // int[] numbers = {2, 25, 265};
        // //int[] numbers = new int[3];
        // // numbers[0] = 5;
        // // numbers[1] = 25;
        // // numbers[2] = 265;
        // System.out.println(numbers.length);
        // System.out.println(Arrays.toString(numbers));

        //practice1
        DS2Array num = new DS2Array(5);
        num.insert(10);
        num.insert(20);
        num.insert(30);
        num.insert(40);

        num.removeAt(0);
        num.print();

    }
}
