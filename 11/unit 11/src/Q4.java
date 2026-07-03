import java.util.ArrayList;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter numbers (end with 0): ");
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            list.add(num);
        }
        System.out.println("Maximum is: " + max(list));
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;
        Integer max = list.get(0);
        for (int num : list) {
            if (num > max)
                max = num;
        }
        return max;
    }


}
