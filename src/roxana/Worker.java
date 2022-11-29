package roxana;

public class Worker {
    private String name;
    private WorkingCalendar workingCalendar;

    public Worker(String name) {
        this.name = name;
        this.workingCalendar = new WorkingCalendar();
    }

    public void lucreaza(String zi) throws ExceptionNotWorkingDay {
        int indexZi = workingCalendar.existaZi(zi);
        if (indexZi == -1) {
            System.out.println(zi + " not a week day");
        } else {
            if (workingCalendar.getDays()[indexZi].isWorkingDay())
                System.out.println(name + " works " + zi);
            else throw new ExceptionNotWorkingDay("Not a working day!");
        }
    }
}
