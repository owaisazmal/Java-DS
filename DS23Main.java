public class DS23Main {
    public static void main(String[] args) {
    
    DS23DynamicArray dynamicArray = new DS23DynamicArray(12);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");

    dynamicArray.insert(0, "X");
    dynamicArray.delete("A");
    System.out.println(dynamicArray.search("C"));

    System.out.println("Capacity: " + dynamicArray.capacity);
    System.out.println("Size: " + dynamicArray.size);
    System.out.println(dynamicArray);
    System.out.println(dynamicArray.isEmpty());
    }
}
