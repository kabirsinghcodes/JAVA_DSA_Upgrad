public class function4 {
    static void vote(int age){
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible");
        }

    }
    public static void main(String[] args) {
        vote(20);
    }
}
