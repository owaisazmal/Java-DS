public class DS13StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Owais");
        System.out.println(sb);

        //CharAt index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        //Insert
        sb.insert(0, 'S');
        System.out.println(sb);

        //Delete the i
        sb.delete(4, 5);
        System.out.println(sb);

        //Append (Jodna)
        StringBuilder test = new StringBuilder("H");
        test.append("e");   //str = str + "e";
        test.append("l");
        test.append("l");
        test.append("o");
        System.out.println(test);
        System.out.println(test.length());      //print length
        
        //Q: Reverse String Question {Tony -> ynoT}
        StringBuilder test2 = new StringBuilder("Test");

        for(int i = 0; i<test2.length()/2; i++){
            int front = i;
            int back = test2.length() - 1 - i;

            char frontChar = test2.charAt(front);
            char backChar = test2.charAt(back);

            test2.setCharAt(front, backChar);
            test2.setCharAt(back, frontChar);
        }
        System.out.println(test2);
    }
}
