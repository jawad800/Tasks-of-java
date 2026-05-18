public class Qu20 {

        public static void main(String[] args) {

            double[] list = {52, 4.1, 4.8,64.6, 1};

            for (int i = 0; i < list.length - 1; i++) {
                int maxIndex = i;

                for (int j = i + 1; j < list.length; j++) {
                    if (list[j] > list[maxIndex]) {
                        maxIndex = j;
                    }
                }

                double temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }

            for (double num : list) {
                System.out.print(num + " : ");
            }
        }


}
