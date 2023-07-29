import java.util.HashSet;
public class Hashsets {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        
        names.add("Kabir");
        names.add("Rahul");
        names.add("Naman");
        names.add("Kabir");
        names.add("Subhash");
        
        System.out.println(names.contains("Kaushal"));

    }
}
