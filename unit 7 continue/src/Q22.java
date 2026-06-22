public class Q22 {
    public static void main(String[] args) {
        if (args.length == 0) {

            System.out.println("No string provided in command line.");
            return;
        }

        String str = args[0];
        int uppercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                uppercaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }
}
