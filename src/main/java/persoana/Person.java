package persoana;

public class Person {

    private int varsta;
    private String nume;
    private String sex;
    private String married;
    private String marriedWith;


    Person(int a, String b, String c, String d) {
        this.varsta = a;
        this.nume = b;
        this.sex = c;
        this.married = d;


    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNume() {
        return nume;
    }

    public String getSex() {
        return sex;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getMarried() {
        return married;
    }

    public void print() {
        System.out.println("Numele persoanei este" + nume);
    }

}
