import java.util.Arrays;

public class Question9{
    public static void main(String[] args){
        double [] m={83,55,3,5,68,8,65434,3};
        System.out.println(Arrays.toString(m));
        min(m);
        System.out.println(min(m));
    }
    public static double min(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

}
