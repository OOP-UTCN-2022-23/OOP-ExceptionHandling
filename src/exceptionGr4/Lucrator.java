package exceptionGr4;

public class Lucrator {
    private String nume;
    private CalendarLucru calendarLucru;

    public Lucrator(String nume) {
        this.nume = nume;
        this.calendarLucru = new CalendarLucru();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public CalendarLucru getCalendarLucru() {
        return calendarLucru;
    }

    public void setCalendarLucru(CalendarLucru calendarLucru) {
        this.calendarLucru = calendarLucru;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        boolean found = false;
        for (int i = 0; i < calendarLucru.getZile().length; i++) {
            if (zi == calendarLucru.getZile()[i].getNume()) {
                found = true;
                if (calendarLucru.getZile()[i].isLucratoare()) System.out.println("Zi lucratoare!");
                else throw new ExceptieZiNelucratoare("Nu este zi lucratoare!");
            }
        }
        if(!found) System.out.println("nu este zi a saptamanii");
    }
}
