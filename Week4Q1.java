package Week4;
import java.util.Scanner;

public class Week4Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter a height in inches: ");
        double height = input.nextDouble();

        BMI newBMI = new BMI();
        newBMI.enterWeight(weight);
        newBMI.enterHeight(height);
        newBMI.BMI();
    }
}
