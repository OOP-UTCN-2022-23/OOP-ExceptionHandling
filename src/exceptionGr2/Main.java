package exceptionGr2;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("Gigel");

        try {
            worker.isWorking("Chocolate");
        } catch (ExceptionNotWorkingDay e) {
            System.out.println(e.getMessage());
        }

        //!The order of the exceptions matter
        Worker worker2 = null;

        try {
            worker2.isWorking("Monday");
        } catch (ExceptionNotWorkingDay e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("the worker cannot be null");
        }
    }
}
