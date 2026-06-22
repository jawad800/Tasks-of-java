import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
       int v=3432;


        if (args.length == 0) {
            System.out.println("No integers provided in command line.");
            return;
        }
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Total sum: " + sum);
    }
}
