package ba.unsa.etf.rpr;

import java.util.ArrayList;

class Semestar {
    private int brojSemestra;
    private ArrayList<Predmet> obavezniPredmeti;
    private ArrayList<Predmet> izborniPredmeti;
    // ArrayList<Student> studenti ?

    void setBrojSemestra() {}
    int getBrojSemestra() {
        return brojSemestra;
    }

    void dodajPredmet(Predmet predmet, boolean obavezan) {}
    void izbaciPredmet(Predmet predmet) {}
}
