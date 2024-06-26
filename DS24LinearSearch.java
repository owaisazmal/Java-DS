public class DS24LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,6,9,4,10,5};

        int index = linearSearch(arr, 1);

        if(index != -1){
            System.out.println("Elemnt found at index: "+ index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        
        return -1;
    }
}
