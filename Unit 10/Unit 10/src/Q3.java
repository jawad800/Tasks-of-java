public class Q3 {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(70);
        System.out.println(num.isPrime());
        System.out.println(num.isEven());
        System.out.println(num.isOdd());
    }
}
    class MyInteger {
        private int value;
        MyInteger(int value) {
            this.value = value;
        }
        int getValue() {
            return value;
        }
        boolean isEven() {
            return value % 2 == 0;
        }
        boolean isOdd() {
            return value % 2 != 0;
        }
        boolean isPrime() {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false;
            }
            return true;
        }
        static boolean isEven(int num) {
            return num % 2 == 0;
        }
        static boolean isOdd(int num) {
            return num % 2 != 0;
        }
        static boolean isPrime(int num) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }



