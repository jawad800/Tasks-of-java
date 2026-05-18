import java.util.Arrays;
import java.util.Random;

public class Que13 {

        public static int Random(int... numbers) {
            int index = (int)(Math.random() * numbers.length);
            return numbers[index];
        }

        public static void main(String[] args){
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));

            System.out.println(Random(numbers));
        }



}
