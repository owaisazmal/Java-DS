import java.util.HashMap;

public class DS6HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Owais", 4651);
        empIds.put("Azmal", 5451);
        empIds.put("Waqas", 5791);
    
        System.out.println(empIds);
        System.out.println(empIds.get("Owais"));
        System.out.println(empIds.containsKey("Owais"));
        System.out.println(empIds.containsValue(4651));
        
        empIds.put("Owais", 5451);
        System.out.println(empIds);
        empIds.replace("Waqas", 9135);
        System.out.println(empIds);
    }
}
