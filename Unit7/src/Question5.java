import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] distinct = new int[10];
        int distinctCount = 0;
        int n=0;
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            boolean isD = false;
            for (int j = 0; j < distinctCount; j++) {
                if (numbers[i] == distinct[j]) {
                    isD= true;
                    break;
                }
            }
            if (!isD) {
                distinct[distinctCount] = numbers[i];
                distinctCount++;
                n++;
            }
        }
        System.out.println("the number of distinct numbers "+n);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(distinct[i] + " ");

        }
        System.out.println();

    }
}
