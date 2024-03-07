import java.util.Scanner;

public class DS12Strings {
    public static void main(String[] args) {
        //Declaration
        String Firstname = "Owais";
        String LastName = "Khan";
        
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Your name is: " + name);

        //Concatination
        String FullName = Firstname + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.length());
        
        //CharAt
        // for(int i = 0; i<FullName.length(); i++){
        // System.out.println(FullName.charAt(i));
        // }
        
        //String Compare

        //Can also use LastName == FullName but it doesn't work all the time
        if(LastName.compareTo(FullName) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        String sentence = "My name is Owais";

        //substring(begining index, ending index)
        String Name = sentence.substring(0, 4);
        String Name1 = sentence.substring(6);//Going to print upto 6 char
        System.out.println(Name);
        System.out.println(Name1);

        //Strings in Java are Immutable (Once you have created a string in a memory you can't change it)
    }
}
