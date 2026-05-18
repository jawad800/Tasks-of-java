import java.util.Arrays;

public class Question10 {
    public static void main(String[]args){
        double [] m={83,55,3,5,68,8,65434,3};
        System.out.println(Arrays.toString(m));

        System.out.println(smallest(m));
    }
        public static int smallest(double[] array) {
            int index = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[index])
                    index = i;
            }

            return index;
        }
    }

