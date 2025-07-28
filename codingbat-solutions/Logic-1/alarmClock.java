public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);

        if (vacation) {
            return isWeekend ? "off" : "10:00";
        } else {
            return isWeekend ? "10:00" : "7:00";
        }

    }

}
