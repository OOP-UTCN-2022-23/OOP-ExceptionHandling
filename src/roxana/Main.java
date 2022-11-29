package roxana;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Roxana");

        try {
            worker1.lucreaza("Sunday");
        } catch (ExceptionNotWorkingDay e) {
            System.out.println(e.getMessage());
        }

        //The order of exceptions matters !
        Worker worker2 = null;
        try {
            worker2.lucreaza("Sunday");
        } catch (ExceptionNotWorkingDay e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Worker should not be null");
        }
    }
}
