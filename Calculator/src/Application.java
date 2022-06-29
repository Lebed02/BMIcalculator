import java.util.Scanner;

public class Application {
    public static void main(String [] args) {
        boolean wantToContinue = true;
        while (wantToContinue) {
            Scanner sc = new Scanner(System.in);

            double weight;
            while (true) {
                try {
                    do{
                        System.out.println("Enter your weight in kg");
                        weight = Double.parseDouble(sc.nextLine());
                        if(weight <= 0)
                        {
                            System.out.println("Invalid value");
                            System.out.println("Try again\n");
                        }
                    } while (weight <= 0);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("This is not a number!");
                    System.out.println("Enter your weight again\n");
                }
            }

            double height;
            while (true) {
                try {
                    do{
                        System.out.println("Enter your height in cm");
                        height = Double.parseDouble(sc.nextLine());
                        if(height <= 0)
                        {
                            System.out.println("Invalid value");
                            System.out.println("Try again\n");
                        }
                    } while (height <= 0);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("This is not a number!");
                    System.out.println("Enter your height again\n");
                }
            }
            double heightInMeters = height / 100;
            double BMIresult = weight / Math.pow(heightInMeters, 2);
            if (BMIresult < 18.5) {
                System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMIresult + "\nIt is underweight\n"+"----------------\n");
            } else if (BMIresult >= 18.5 && BMIresult <= 25) {
                System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMIresult + "\nIt is normal weight\n"+"----------------\n");
            } else if (BMIresult >= 25 && BMIresult <= 30) {
                System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMIresult + "\nIt is overweight\n"+"----------------\n");
            } else if (BMIresult >= 30 && BMIresult <= 40) {
                System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMIresult + "\nIt is obesity\n"+"----------------\n");
            } else if (BMIresult >= 40) {
                System.out.println("\n----------------\n"+"Your BMI is:" + (int) BMIresult + "\n It is morbid obesity\n"+"----------------\n");
            }
            System.out.println("Do you want to calculate again?\n");
            boolean answerIsValid;
            System.out.println("Press [Y] to continue");
            System.out.println("Press [F] to exit");
            String agree = sc.next();
            do {

                if (agree.equals("Y") || agree.equals("y")) {
                    wantToContinue = true;
                    answerIsValid = true;
                } else if (agree.equals("F") || agree.equals("f")) {
                    wantToContinue = false;
                    answerIsValid = true;
                } else {
                    System.out.println("Invalid answer");
                    System.out.println("Try again");
                    answerIsValid = false;
                    agree = sc.next();
                }
            } while (!answerIsValid);
        }
    }
}
