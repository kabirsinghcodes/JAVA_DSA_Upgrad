public class oops2 {
    static void staticfunction() {
        System.out.println("Static");
    }

    public void publicfunction(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        staticfunction();

        oops2 obj = new oops2();
        obj.publicfunction();
    }
}
