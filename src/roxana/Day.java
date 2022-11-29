package roxana;

import java.util.Objects;

public class Day {
    private String name;
    private boolean workingDay;

    public Day(String nume, boolean workingDay) {
        this.name = nume;
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Day)) return false;
        Day zi = (Day) o;
        return isWorkingDay() == zi.isWorkingDay() && Objects.equals(getName(), zi.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isWorkingDay());
    }
}
