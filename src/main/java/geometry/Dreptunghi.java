package geometry;

public class Dreptunghi {
    private double lungime;
    private double latime;

    Dreptunghi ( double L, double l){
        this.latime = l; this.lungime =L;
    }

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }

    public double calculeazaArie() {
        return this.latime*this.lungime;
    }

    public double calculeazaPerimetru() {
        return  2* (this.lungime+this.latime);
    }

    public void print (){
        System.out.println("Aria dreptunghiului este: " + this.calculeazaArie());
        System.out.println("PErimetrul dreptunghiului este: " + this.calculeazaPerimetru());
    }
}

