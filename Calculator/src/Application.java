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


            Calculator calculator1 = new Calculator(weight,height);
            calculator1.showResult();


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
