package persoana;

import java.util.HashSet;

public class PersonMarriedPeople {

    Person[] person1;
    Person[] person2;

    int couple = 0;
    int fem = 0;
    int masc = 0;

    public PersonMarriedPeople(Person[] person1, Person[] person2) {
        this.person1 = person1;
        this.person2 = person2;
    }


    public int marriedPeople() {

        Person married = new Person(1, "a", "b", "c");
        HashSet<Person> set = new HashSet<>();

        for (int x = 0; x < person1.length; x++) {

            for (int y = 0; y < person2.length; y++) {
                if (person1[y].getSex().equals("masc")) {
                    if (person1[y].getMarried().equals("yes")) {
                    }
                    if (person1[x].getSex().equals("fem")) {
                        if (person1[x].getMarried().equals("yes")) {
                            couple++;
                        }
                    }

                }

            }

        }
        return couple;


    }
}


