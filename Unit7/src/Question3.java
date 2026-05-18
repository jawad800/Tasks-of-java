import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[10];

        System.out.println("type 10 value between 0 and 9");


        for (int i = 0; i <10; i++) {
            int num = input.nextInt();
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
