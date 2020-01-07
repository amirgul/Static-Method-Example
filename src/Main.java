import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Measurement shopper = new Measurement();
        System.out.println("enter inches");
        double inches = keyboard.nextDouble();
        double feet = Measurement.inchesToFoot(inches);
        System.out.println("inches: "+ inches +" feet is: "+ feet);

        System.out.println("now enter foot");
        feet = keyboard.nextDouble();
        inches = Measurement.footToInches(feet);
        System.out.println("feet: "+ feet +" inches: "+ inches);

    }
}
