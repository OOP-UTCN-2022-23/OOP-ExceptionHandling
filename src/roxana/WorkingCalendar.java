package roxana;

public class WorkingCalendar {
    private Day[] days;

    public WorkingCalendar() {
        this.days = new Day[]{
                new Day("Monday", true),
                new Day("Tuesday", true),
                new Day("Wednesday", true),
                new Day("Thursday", true),
                new Day("Friday", true),
                new Day("Saturday", false),
                new Day("Sunday", false)
        };
    }

    public Day[] getDays() {
        return days;
    }

    public int existaZi(String nume) {
        for (int i = 0; i < days.length; i++) {
            if (nume.equals(days[i].getName())) {
                return i;
            }
        }
        return -1;
    }
}
