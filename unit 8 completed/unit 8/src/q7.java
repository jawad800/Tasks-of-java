public class q7 {// inconplete
    //???
    public static void main(String[] args) {
        double[][] points = {{1, 2}, {3, 4}, {5, 1}, {2, 3}
        };
        double minDist = Double.MAX_VALUE;
        int p1 = 0, p2 = 1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dx = points[i][0] - points[j][0];
                double dy = points[i][1] - points[j][1];
                double dist = Math.sqrt(dx * dx + dy * dy);
            }
        }
    }
    }