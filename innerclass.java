class outerclass{
    int a = 10;
    class innerclass{
        int b = 20;
    }
}
public class innerclass{
public static void main(String[] args) {
    outerclass obj = new outerclass();
    outerclass.innerclass obj2 = obj.new innerclass();
    System.out.println(obj.a + obj2.b);
}
}