import java.util.Arrays;

public class Q12 {

        public static void reverse(int[] list) {
            for (int i = 0; i < list.length / 2; i++) {
                int temp = list[i];
                list[i] = list[list.length - 1 - i];
                list[list.length - 1 - i] = temp;
            }
        }
    public static void main(String[] args) {
       int[] m ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(m));
        reverse(m);
        System.out.println(Arrays.toString(m));
    }

}
