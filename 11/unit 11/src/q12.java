import java.util.ArrayList;
import java.util.Scanner;
// task SumList
public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println("Sum = " + sum(list));
    }
    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double n : list)
            total += n;
        return total;
    }

}
