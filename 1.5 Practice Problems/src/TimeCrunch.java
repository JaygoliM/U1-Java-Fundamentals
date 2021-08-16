public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
      double theNumber = 6000.0;
      double hours = theNumber/3600.0;
      double minutes = theNumber/60.0;
      double seconds = theNumber/1.0;
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }
}
