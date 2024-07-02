public class DS26InterpolationSearch {
    //Interpolation DAta works very well with uniformly distributed Data.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = interpolationSearch(array,8);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.err.println("Element not found");
        }
    }

    public static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;

        while (value >= array[low] && value <= array[high]) {
            int probe = (high - low) * (value - array[low]/ (array[high] - array[low]));
            
            System.out.println("Probe: " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if (array[probe] == value){
                return probe + 1;
            }
            else{
                high = probe - 1;
            }
        }
        
        return -1;
    }
    
}
