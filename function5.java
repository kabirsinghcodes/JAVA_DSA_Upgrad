public class function5 {
    static int sum1(int a , int b)
    {
        return a + b;
    }
    static double sum1(double a, double b)
    {
        return a + b;
    }
    public static void main(String[] args) {

        int mysum1 = sum1(10, 20);
        double mysum2 = sum1(2.7, 4.5);
        System.out.println("int : "+mysum1);
        System.out.println("double : "+mysum2);
        
    }
}
