package exceptionGr2;

public class Worker {
    String name;
    WorkingCalendar workingCalendar;

    public Worker(String name) {
        this.name = name;
        this.workingCalendar = new WorkingCalendar();
    }

    public void isWorking(String day) throws ExceptionNotWorkingDay {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(int i = 0; i < daysOfWeek.length; i++)
            if(day == daysOfWeek[i]) {
                if(workingCalendar.getDays()[i].isWorkingDay())
                    System.out.println("It s a woking day");
                else throw new ExceptionNotWorkingDay("Not a working day!");
                return;
        }
        System.out.println("This was not a day");
    }
}
