public class DS16Sorting {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,1,7,6,2};
        //O(n^2)
        //Bubble Sort
        for(int i = 0; i< arr.length-1; i++){       //n-1
            for(int j = 0; j<arr.length-i-1; j++){  
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
        System.out.println();

        //O(n^2)
        //Selection sort
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                smallest = j;
                }
            }
            int temp2 = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp2;
        }
        printArr(arr);
        System.out.println();
        //Insertion Sort
        for(int i=0; i>arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }
}
