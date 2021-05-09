
public interface DaysCalculation {
    /**
     * Determining days in between dates;
     * Source for count days: https://stackoverflow.com/questions/20165564/calculating-days-between-two-dates-with-java
     * various contributors
     */
    default long getDifferenceDays(String date1, String date2)
    {

    }

    /** determining targetdate after adding days to a date
     * Source: Beginnersbook.com; https://beginnersbook.com/2017/10/java-add-days-to-date/#3
     */
    default String addDaysToDate (String orderDate, int transportDays)
    {

    }
}
