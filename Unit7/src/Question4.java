public class Question4 {
    public static void main(String[] args) {
        int sum=0;
        int n=0;
        int [] num={12,77,86,78,90,45,100,89};
        for (int i = 0; i<num.length; i++){
            sum+=num[i];
            n++;

        }
        double average=sum/n;
        int countup=0;
        int countdown=0;
        System.out.println("The average of "+n+" numbers is "+average);
        for(int k=0;k<n;k++){
            if (num[k]>average){
                countup++;

            } else if (num[k]<average) {
                countdown++;

            }

        }
        System.out.println(countup+" numbers are above the average");
        System.out.println(countdown+" numbers are below the average");
    }
}
