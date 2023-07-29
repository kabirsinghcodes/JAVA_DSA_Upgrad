import java.util.ArrayList;
public class arrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kabir");
        names.add("Shiv");
        names.add("Kaushal");
        System.out.println(names);
        for(String i : names)
        {
            System.out.println(i);
        }
    }
}
