package persoana;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonMarriedPeopleTest {
    @Test
    public void stareCivila (){
        Person unu = new Person(20, "Maria", "fem", "no");
        Person doi = new Person(22, "Ana", "fem","yes");
        Person trei = new Person(30, "Bog", "masc","yes");
        Person patru = new Person(32, "Dan", "masc","no");
        Person cinci = new Person(32, "Nadia", "fem","yes");
        Person sase = new Person(32, "Denis", "masc","yes");
        Person sapte = new Person(32, "Maya", "fem","yes");
        Person opt = new Person(32, "Gigi", "masc","yes");


        Person[] pers = {unu, doi, trei, patru,cinci,sase,sapte,opt};
        Person[] pers2 = {unu, doi, trei, patru,cinci,sase,sapte,opt};

        PersonMarriedPeople person = new PersonMarriedPeople(pers,pers2);

        System.out.println();
    }

}