import java.util.ArrayList;
import java.util.Date;
class Q60 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("Hello Java");
        list.add(new Circle());
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
class Circle {
    double radius = 5;
    public String toString() {
        return "Circle radius = " + radius;
    }
}
class Loan {
    public String toString() {
        return "Loan object";

    }
}


