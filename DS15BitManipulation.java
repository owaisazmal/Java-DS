public class DS15BitManipulation {
    //Get bit
    //Set bit
    //Clear bit
    //Update bit
    public static void main(String[] args) {
        //Get 3rd bit of the number n

        //The process(Bit Masking):-
        //lets n = 0101 -> 

        //Get Bit
        int n = 5;  //0101
        int pos = 1;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("Bit was 1");
        }

        //Set Bit
        //Convert 5 -> 7 using Bit manipulation

        int newNum = bitMask | n;
        System.out.println(newNum);

        //Clear Bit
        /* i)   1<<2 = 0010
         * ii)  ~(0100) = 1011    (Calculating the not(All 0 becomes 1 and vice versa))
         * iii) (1011)&(0101)     (Perform & and evrything will become 0)
         */
        int newPos = 2;
        int newBitMask = 1<<newPos;
        int notBitMask = ~(newBitMask); 

        int newNum2 = notBitMask & n;
        System.out.println(newNum2);
        
        //Update Bit 
        //1<<2 = 0001<<2 = 0100
        int x = 5;
        int pos2 = 1;
        int oper = 1;

        //Set operation
        int bitMask1 = 1<<pos2;
        if(oper == 1){
            int newNum3 = bitMask1 | x;
            System.out.println(newNum3);
        } else{
            int newBitmask1 = ~(bitMask1);
            int newNum3 = newBitmask1 & x;
            System.out.println(newNum3);
        }
    }
}
