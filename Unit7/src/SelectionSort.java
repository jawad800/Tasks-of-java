public class SelectionSort {
    public static void selection(double[] list){
        for(int i=0;i<list.length-1;i++){
            double min=list[i];
            int minIndex=i;
            for (int j=i+1;j<list.length;j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                    list[minIndex]=list[i];
                    list[i]=min;

            }



        }
    }
    public static void main(String[] args){
        double[] P={1,4,6,7,9,12,13,14,56,78,90};
        double[] P1={1,4,7,6,9,12,13,14,56,78,90};
        double[] P2={1,4,6,2,13,14,56,78,90};
        System.out.print(java.util.Arrays.toString(P));
        System.out.println(" ");
        java.util.Arrays.fill(P,2,5,8);
        for (double x : P) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("p and p1 are equal "+java.util.Arrays.equals(P,P1));
        System.out.println("1 index is "+java.util.Arrays.binarySearch(P,7));
        char[] c={'a','b','c','d','e','f','g','h','i'};
        System.out.println("2 index is "+java.util.Arrays.binarySearch(c,'i'));

    }
}
