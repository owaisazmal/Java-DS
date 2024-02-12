public class DS8UserAverage {

    public static void userAvg(int num1, int num2, int num3){
        int avg = (num1+num2+num3)/3;
        System.out.println(avg);
        return;
    }
    public static void main(String[] args) {
        userAvg(5, 5, 4);
    }
}
