import java.util.ArrayList;
import java.util.Collections;
public class arrays2 {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(100);
    nums.add(20);
    nums.add(3);
    nums.add(42);
    System.out.println(nums);
    Collections.sort(nums);
    System.out.println(nums);
  }  
}
