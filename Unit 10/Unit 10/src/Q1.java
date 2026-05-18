
public class Q1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(34000000);

        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}
class Time {
    private int hour;
    private int minute;
    private int second;
    Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
    Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;

        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;

        hour = (int)(totalHours % 24);
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    int getHour() {
        return hour;
    }
    int getMinute() {
        return minute;
    }
    int getSecond() {

        return second;
    }
    void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
}

