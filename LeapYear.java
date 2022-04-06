public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(5600));

    }

    public static boolean isLeapYear(int year) {

        if (9999 < year || year < 1) {
            System.out.println("INVALID VALUE ENTRY");
            return false;
        }

        if (((year % 4 == 0) && (year % 100 == 0)) && (year % 400 == 0)) {
            System.out.println("entry is a leap year");
            return true;

        } else {
            System.out.println("entry is not a leap year");
            return false;
        }}}
    // Please open the readme.txt file and answer 4th question.

