package Week4;

public class BMI
{
    private double kgMultiplier = 0.45359237;
    private double metersMultiplier = 0.0254;

    private double pounds = 0;
    private double inches = 0;
    //BMI = kg/m^2

    public void enterWeight(double pounds)
    {
        this.pounds = pounds;
    }

    public void enterHeight(double inches)
    {
        this.inches = inches;
    }

    public void BMI()
    {
        double BMI = this.convertToKG(this.pounds)/Math.pow(this.convertToMeters(this.inches),2);
        System.out.println("BMI is : " + BMI);
    }

    private double convertToKG(double pound)
    {
        return pound*kgMultiplier;
    }

    private double convertToMeters(double inches)
    {
        return inches*metersMultiplier;
    }
}
