// Speed Converter
//
// 1. Write a method called toMilesPerHour that has 1 paramater of type double with the name kilometersPerHoue.
// This method needs to return the rounded value fo the calculation of type long.
//
// If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
//
// Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
// For conversion and rounding, check the notes in the text below.
//
// 2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour parameter
//
// This method should notreturn anything(void) and it needs to calculte milersPerHour from the KilometersPerHour parameter.
//
// Then it needs to print a message in the foromat "XX kn/h = YY mi/h".
//
// XX represnts the origanl value kilometersPerHour.
// YY represents the rounded milesPerHour from the kilometersPerHour parameter.
//
// If the parameter kilometersPerHour is < 0 then prunt the text "Invalid Value"


public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }


    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h " + milesPerHour + "mi/h");
        }
    }
}