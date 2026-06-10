public class Qu15 {//completed
    public static void main(String[] args) {
        double[][] points = {{7, 7}, {1, 10}, {8, 8}};
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            if (distance <= 10) {
                System.out.println("instide: (" + points[i][0] + "," + points[i][1] + ")");
            }
        }
    }
}