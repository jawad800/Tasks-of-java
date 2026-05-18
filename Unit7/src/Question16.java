public class Question16 {
          public static int linearSearch(int[] list, int key) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == key)
                    return i;
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] list = {32,33,44,6,77,81, 9};
            System.out.println(linearSearch(list, 77));
        }


}
