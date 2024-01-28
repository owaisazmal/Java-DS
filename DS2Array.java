public class DS2Array {
//test
    private int[] items;
    private int count;

    public DS2Array(int len){
        items = new int[len];
    }

    public void insert(int item){
        if (items.length == count){

            int[] newItems = new int[count * 2];

            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
                items = newItems;
             }
        }
        items[count++] = item;
    }
    public void removeAt(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
    for (int i = index; i<count; i++){
        items[i] = items[i + 1];
    }

    count--;

    }
    // public int indexOf(int item){
    //     for(int i = 0; i < count; i++){
    //       if(items[i] == item){
    //         return i;

    //     return -1;
    //       }  
    //     }
    // }
    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

}
