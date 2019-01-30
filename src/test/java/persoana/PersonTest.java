package persoana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person unu = new Person(20, "Maria", "Fem","no");
    Person doi = new Person(22, "Ana", "fem","yes");
    Person trei = new Person(30, "Bog", "masc","yes");
    Person patru = new Person(32, "Dan", "masc","no");

@Test
    public void getPersonArgs() {

        Assert.assertEquals(20,unu.getVarsta());

    }

}