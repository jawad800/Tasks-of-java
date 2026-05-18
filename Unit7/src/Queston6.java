public class Queston6 {
    public static void main(String[] args) {
        final int number1 = 50;
        int count = 0;
        int number = 2;

        while (count < number1) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
