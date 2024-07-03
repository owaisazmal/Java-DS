public class DS29InsertionSort {
    public static void main(String[] args) {
        int[] array = {9,2,4,1,3,6,7,10,11};

        insertionSort(array);
        
        for(int i :  array){
            System.out.print(i + " ");
        }

    }

    public static void insertionSort(int[] array){
        for(int i = 0; i<array.length-1; i++){
            int temp = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
