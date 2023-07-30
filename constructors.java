public class constructors {
    int x;

    public constructors(int y) {
        x = y;
    }

    public static void main(String[] args) {
        constructors obj = new constructors(30);
        System.out.println(obj.x);
    }
}
