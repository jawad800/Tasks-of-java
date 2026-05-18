import java.util.Arrays;

public class Q11 {//incomplete
    public static void main(String[] args) {
        double [] m={83,55,3,5,68,8};
        System.out.println(Arrays.toString(m));

    }

        public static double deviation(double[] x) {
            double mean =0;
            double sum = 0;

            for (double v : x) {
                sum += Math.pow(v - mean, 2);
            }

            return Math.sqrt(sum / (x.length - 1));
        }
    }


