import java.util.ArrayList;
import java.util.Collections;
 class Q6 {// Shuffling task
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
    }
}
