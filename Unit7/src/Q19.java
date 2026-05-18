import java.util.Arrays;

public class Q19 {
   public static void main(int[] arr){
       int[] numbers = {1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(numbers));
       sort(numbers);
       System.out.println(sort(numbers));

   }


   public static boolean sort(int[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1])
                    return false;
            }
            return true;


   }

}
