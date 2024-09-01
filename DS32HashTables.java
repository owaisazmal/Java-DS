import java.util.Hashtable;

public class DS32HashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(21);

        table.put(123, "devaansh");
        table.put(614, "Omar");
        table.put(456, "Azrin");
        table.put(365, "Nawshin");
        table.put(100, "Owais");

        //table.remove(365);

        for(Integer key: table.keySet()){
            System.out.println(key.hashCode()%21 + "\t" + key+ "\t" + table.get(key));
        }
    }
}
