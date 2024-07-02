public class DS27BubbleSort {
    public static void main(String[] args) {
        int array[] = {9,2,4,2,3,5,10};

        bubbleSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }
    public static void bubbleSort(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i; j++){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }

}
