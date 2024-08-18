public class DS30MergeSort {
    public static void main(String[] args) {
        int [] array = {1,5,3,6,8,9,2,4,3};
        
        mergeSort(array);

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void mergeSort(int[] array){

        int length = array.length;
        if(length <= 1) return; //base case
        
        int middle = length / 2;
        int[] leftArray = new int [middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i<length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }
    //test

    public static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        //check conditions for merging 
        if(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[i];
            i++;
            l++;
        }
        while(r<rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
