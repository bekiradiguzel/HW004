public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println("Km -->\t" + toMilesPerHour(75.114));
        printConversion((25.42));
    }
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("İnvalid value entry.");
            return -1;
        }
        return Math.round(kilometersPerHour * (0.621371));
    }
    public static void printConversion(double kilometersPerHour) {
        String XX = String.valueOf(kilometersPerHour);
        double milesPerHour = Math.round(kilometersPerHour * (0.621371));
        String YY = String.valueOf(milesPerHour);
        //message in the format "XX km/h = YY mi/h".
        System.out.println(XX + "km/h," + YY + " mi/h");
    }
}

