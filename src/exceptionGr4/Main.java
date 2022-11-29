package exceptionGr4;

public class Main {
    public static void main(String[] args) {
        Lucrator lucrator = new Lucrator("Georgica");

        try {
            lucrator.lucreaza("Lari");
        }catch(ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }

        Lucrator lucrator2 = null;

        try {
            lucrator2.lucreaza("Lari");
        }catch(ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }catch(NullPointerException e) {
            System.out.println("Nu poate sa fie null");
        }
    }
}
