

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long cal = 0l;
        if (kilometersPerHour < 0) {
            cal = -1;
        } else {
            cal = Math.round(kilometersPerHour / 1.6093);
        }
        return cal;
    }

    public static void printConversion(double kilometersPerHour) {
        long cal = 0l;
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        }else{
            cal = Math.round(kilometersPerHour / 1.6093);
            System.out.println(kilometersPerHour + " km/h" + " = " + cal + " mi/h");
        }
    }
}