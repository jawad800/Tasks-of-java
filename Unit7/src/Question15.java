import java.util.Arrays;//incomplate
public class Question15 {
    public static void main(String[] args) {

        int[] num = {23, 45, 3, 3, 4, 6, 73, 2, 45, 65};
        System.out.println(Arrays.toString(num));
        dup(num);

        System.out.println(Arrays.toString(num));
    }

    public static int[] dup(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int num : list) {

            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (temp[i] == num) {
                    found = true;
                    break;
                }
            }


        }
        return temp;
    }
}


