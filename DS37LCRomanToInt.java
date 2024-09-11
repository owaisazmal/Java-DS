import java.util.Hashtable;

public class DS37LCRomanToInt {
    public static void main(String[] args) {
        DS37LCRomanToInt converter = new DS37LCRomanToInt();
        int result = converter.romanToInt("III");
        System.out.println("Result: " + result);
    }
    public int romanToInt(String s) {
        Hashtable<Character, Integer> romanValues = new Hashtable<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int ans = 0;
        for(int i = 0; i< s.length(); i++) {
            if(i < s.length() - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                ans -= romanValues.get(s.charAt(i));
            } else {
                ans += romanValues.get(s.charAt(i));
            }
        }

        return ans;
    }
}
