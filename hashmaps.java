import java.util.HashMap;
public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String,String>();
        names.put("Kabir", "Singh");
        System.out.println(names);
        for(String i : names.keySet())
        {
            System.out.println("key: "+i+" Values: "+names.get(i));
        }
    }
}
