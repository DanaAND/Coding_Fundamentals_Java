package geometry;

import static java.lang.Math.PI;

public class Cerc {

    private double raza;

    public Cerc (double r){
        this.raza = r;
    }

    public double calculeazaAria() {
        return Math.PI * raza *raza;
    }

    public double calculeazaPerimetrul () {
        return 2 * PI * raza;
    }

    public  void print () {
        System.out.println("Aria cercului este : " + this.calculeazaAria());
        System.out.println("Perimetrul cercului este : " + this.calculeazaPerimetrul());
    }
}
