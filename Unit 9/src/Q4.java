import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random random = new Random(12);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
