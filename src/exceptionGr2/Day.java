package exceptionGr2;

public class Day {
    private String name;
    private boolean workingDay;

    public String getName() {
        return name;
    }

    public Day(String name, boolean workingDay) {
        this.name = name;
        this.workingDay = workingDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        this.workingDay = workingDay;
    }
}
