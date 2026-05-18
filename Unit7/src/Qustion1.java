import java.util.Scanner;
// Best Grade Among the Students
public class Qustion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the students :");
        int n_Student=sc.nextInt();
        System.out.println("enter :"+n_Student+" Marks ");
        double[] grades = new double[n_Student];
        int max=0;
       for (int i=0;i<n_Student;i++){
           grades[i]=sc.nextDouble();

           if (grades[i]>max){
               max= (int) grades[i];
           }
       } double best=max;
        for (int i = 0; i < grades.length; i++) {
               if( grades[i]==best)
                   System.out.println("student "+(i+1)+" Score "+grades[i]+" is in grade 'A");
               else if (grades[i]>=best-20)
                   System.out.println("student "+(i+1)+" Score "+grades[i]+" is in grade 'B");
               else if (grades[i]>=best-30)
                   System.out.println("student "+(i+1)+" Score "+grades[i]+" is in grade 'C");
               else if (grades[i]>=best-40)
                   System.out.println("student "+(i+1)+" Score "+grades[i]+" is in grade 'D");
               else {
                   System.out.println("student "+(i+1)+" Score "+grades[i]+" is in grade 'F");
               }

        }
    }
}

