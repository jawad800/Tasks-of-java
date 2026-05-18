import java.util.GregorianCalendar;
public class Question5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(43534332L);
         System.out.println("After Change:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

