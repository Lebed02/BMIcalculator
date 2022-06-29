public class Calculator {
    private double weight;
    private double height;

    public Calculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBMI(){
        double heightInMeters = height / 100;
        double BMIresult = weight / Math.pow(heightInMeters, 2);
    return BMIresult;
    }

    public void showResult(){
        double BMI = calculateBMI();
        if (BMI < 18.5) {
            System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMI + "\nIt is underweight\n"+"----------------\n");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMI + "\nIt is normal weight\n"+"----------------\n");
        } else if (BMI >= 25 && BMI <= 30) {
            System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMI + "\nIt is overweight\n"+"----------------\n");
        } else if (BMI >= 30 && BMI <= 40) {
            System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMI + "\nIt is obesity\n"+"----------------\n");
        } else if (BMI >= 40) {
            System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMI + "\n It is morbid obesity\n"+"----------------\n");
        }
    }
}
