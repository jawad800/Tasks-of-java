public class Q2 {
    public static void main(String[] args) {
        BMI bmi = new BMI("Jawad", 20, 54, 163);

        System.out.println("BMI: " + bmi.getBMI());
        System.out.println("Status: " + bmi.getStatus());
    }
}
    class BMI {
        private String name;
        private int age;
        private double weight;
        private double height;
        BMI(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        double getBMI() {
            return weight / ((height * 0.0254) * (height * 0.0254)) * 0.45359237;
        }
        String getStatus() {
            double bmi = getBMI();
            if (bmi < 18.5)
                return "Underweight";
            else if (bmi < 25)
                return "Normal";
            else if (bmi < 30)
                return "Overweight";
            else
                return "Obese";
        }
    }



