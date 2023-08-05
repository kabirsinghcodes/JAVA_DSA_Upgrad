public class main {
    public static void main(String[] args) {
        int n = 15;
        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(currentNumber + " ");
                currentNumber++;
            }
        }
        System.out.println();
    }
}