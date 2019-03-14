package performance;

/***
 *  Gemaakt door Boris Korevaar
 *
 *  Time is een class waar een begin en eindtijd aan te geven van een optreden.
 *
 */
public class Time {
    private int minutes;

    public Time(double start, double end)
    {
        String startMinutes = new Double(start).toString();
        String endMinutes  = new Double(end).toString();
        startMinutes = startMinutes.substring(startMinutes.indexOf('.') + 1);
        endMinutes = endMinutes.substring(endMinutes.indexOf('.') + 1);

        minutes = ((int)end - (int)start) * 60 - (Integer.parseInt(startMinutes) - Integer.parseInt(endMinutes));
    }
    public int getMinutes()
    {
        return minutes;
    }
}
