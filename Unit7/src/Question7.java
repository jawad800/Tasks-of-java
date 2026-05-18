public class Question7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int num = (int)(Math.random() * 10);
            counts[num]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " = " + counts[i]);
        }
    }
}
