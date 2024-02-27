import java.util.Scanner;
//Basics
public class DS10Arrays {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      /*     String[] eng = new String[4];
     
     eng[0] = "F";
     eng[1] = "A";
     eng[2] = "B";
     eng[3] = "A";

     //System.out.println(eng[0]);
     //System.out.println(eng[1]);
     //System.out.println(eng[2]);

     for(int i = 0; i <eng.length; i++){
        System.out.println(eng[i]);
     }


     //User input for arrays

     int size = sc.nextInt();
     int num[] = new int[size];

     //For storing all the values(input)
     for(int i = 0; i < size; i++){
         num[i] = sc.nextInt();
     }

     //For printing all the values(Output)
     for(int i =0; i < size; i++){
        System.out.println(num[i]);
     }
     */

/*Q: Take an array as input from the user. Search for a
given number x and print the index at which it occurs.*/
   int x = sc.nextInt();
   int [] sample = {2,3,12,5,6};
   for(int i = 0; i<sample.length; i++){
      if (sample [i] == x){
         System.out.println("x found at index: " + i);
      }
     }
    }
}
