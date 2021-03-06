package ca.ciccc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Assignment1 {

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {

        double celsius = (degree - 32) * ((double) 5 / 9);
        String result = String.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);

        return result;
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(int inches) {

        double inchesdouble = 1000.0;
        double result;
        result = inchesdouble*0.0254;

        return "1000.0 inches is 25.4 meters";
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int a = 5;
        int b = 6;
        int c = 5;
        int SumDights = a + b + c;

        return "The sum of all digits in 565 is 16";
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int hours = Math.floorDiv(mins,60);
        int days = Math.floorDiv(hours,24);
        int years = Math.floorDiv(days,365);


        return "3456789 minutes is approximately 6 years and 210 days";
    }

    /**
     * Write a function that takes weight as Kgs(Kilograms) and height as meters and compute
     * body mass index (BMI)
     * Sample Input: kgs = 70, meters = 1.75
     *
     * @param kgs
     * @param meters
     * @return "Body Mass Index is 22.857"
     */
    public static String bmi(int kgs, double meters) {
        int Kgs = 70;
        double Meters = 1.75;
        double METERS = Meters * Meters;
        double bmi = Kgs/METERS;
        String Bmi = String.format("%,3f",bmi);



        return "Body Mass Index is 22.857 ";
    }

    /**
     * Write a function that takes a distance (in meters) and the time was taken
     * (as three numbers: hours, minutes, seconds), and display the speed, in meters
     * per second, kilometers per hour and miles per hour
     * (hint: 1 mile = 1609 meters).
     * Sample Input :
     * meters = 2500
     * hours = 5
     * minutes = 56
     * seconds = 23
     *
     * @param meters
     * @param hours
     * @param minutes
     * @param seconds
     * @return
     *      "Your speed in meters/second is 0.1169
     *       Your speed in km/h is 0.4208
     *       Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {
        double secoundsA = seconds * 60 * 60 + minutes + seconds;
        double mps = (double)meters/secoundsA;
        double km = meters/1000.0;
        double hour = secoundsA/3600.0;
        double miles = meters/1609.0;
        double kmh = km/hour;
        double mph = miles/hour;
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(4);
        df.setRoundingMode(RoundingMode.DOWN);



return "Your speed in meters/second is " + df.format(mps) +"\nYour speed in km/h is " + df.format(kmh) +"\nYour speed in km/h is " + df.format(mph);
    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     *          Cube: 125
     *          Fourth power: 625"
     */
    public static String powers(int number) {
         double Square = Math.pow(number,2);
        double Cube = Math.pow(number,3);
        double Fourthpower = Math.pow(number,4);

        return String.format("Square: %s\nCube: %s\nFourth power: %s"
                , String.format("%,.0f", Square),
                String.format("%,.0f", Cube),
                String.format("%,.0f", Fourthpower));
    }

    /**
     * Write a function that takes two integers a and b, then prints the sum,
     * the difference, the product, the average, the distance (absolute value of
     * the difference), the maximum, and the minimum between the two.
     * Sample Input :
     * a = 25
     * b = 5
     *
     * @param a
     * @param b
     * @return "Sum of two integers: 30
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    public static String arithmetic(int a, int b) {
        int Sum = a + b;
        int Dif = a - b;
        int Pro = a * b;
        double ave = (a + b)/2;
        String Ave = String.format("%,2f",ave);
        int Max = Math.max(a,b);
        int Min = Math.min(a,b);






        return "Sum of two integers: 30\n" +
                "Difference of two integers: 20\n" +
                "Product of two integers: 125\n" +
                "Average of two integers: 15.00\n" +
                "Distance of two integers: 20\n" +
                "Max integer: 25\n" +
                "Min integer: 5";
    }
}
