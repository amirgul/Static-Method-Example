public class Measurement
{
    public static final double INCHES_PER_FOOT = 12;
    public static double inchesToFoot(double inches)
    {
        return  inches/INCHES_PER_FOOT;
    }
    public static double footToInches(double foot)
    {
        return foot * INCHES_PER_FOOT;
    }
}
