import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class q16 {// how solve an math 5+1 question
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int answer = a + b;
        ArrayList<Integer> attempts = new ArrayList<>();
        while (true) {
            System.out.print("What is " + a + " + " + b + "? ");
            int user = input.nextInt();
            if (attempts.contains(user)) {
                System.out.println("You already entered " + user);
                continue;
            }
            attempts.add(user);
            if (user == answer) {
                System.out.println("You got it!");
                break;
            } else {

                System.out.println("Wrong answer. Try again.");
            }
        }
    }
}
