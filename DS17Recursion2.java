//Important quesations
public class DS17Recursion2 {
    //O(2^n)
    //Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    } 
    //Print String in reverse = abcd->dcba
    //O(n)
    public static void StringRev(String str, int idx){
        if(idx == 0){
        System.out.print(str.charAt(idx));
        return;
    }
        System.out.print(str.charAt(idx));
        StringRev(str, idx-1);
    }
    //Find the first and the last occurance of an element in a string
    public static int first = -1;
    public static int last = -1;
    public static void OccStr(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            first = idx;
        }else{
            last = idx;
        }
        OccStr(str, idx+1, element);
    }

    //Check if an Array is sorted or not
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    } 

    public static void main(String[] args) {
        int n = 3;
        String str = "abcdkjsdfaaha";
        //towerOfHanoi(n, "S", "H", "D");
        //StringRev(str, str.length()-1);
        OccStr(str, 0, 'a');

    }
}
