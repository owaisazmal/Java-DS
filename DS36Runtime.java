public class DS36Runtime {
    public static void main(String[] args) throws InterruptedException{
        long start = System.nanoTime();

        // ---------------Sample program ----------------------

        Thread.sleep(3000);

        // ---------------Sample program ----------------------

        long duration = (System.nanoTime() - start)/10000;
        System.out.println(duration + "ms");
    }
}
