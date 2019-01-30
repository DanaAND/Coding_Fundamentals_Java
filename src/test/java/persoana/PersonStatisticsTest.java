package persoana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonStatisticsTest {

    @Test
    public void oldestWomen() {
        Person unu = new Person(20, "Maria", "fem", "no");
        Person doi = new Person(22, "Ana", "fem","yes");
        Person trei = new Person(30, "Bog", "masc","yes");
        Person patru = new Person(32, "Dan", "masc","no");

        Person[] pers = {unu, doi, trei, patru};

        PersonStatistics person = new PersonStatistics(pers);

        System.out.println(person.getOldestWomen().getNume());

        System.out.println(person.getOldestMen().getNume());

        System.out.println(person.womenCount());

        System.out.println(person.averageWomanAge());

        System.out.println(person.averageMenAge());

        System.out.println(person.numberOfMarriedPeople());
    }

}