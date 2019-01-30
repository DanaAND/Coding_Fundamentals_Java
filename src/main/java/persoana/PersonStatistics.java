package persoana;

public class PersonStatistics {

    Person[] person1;

    public PersonStatistics(Person[] person1) {
        this.person1 = person1;
    }

    public Person getOldestWomen() {
        Person z = new Person(1, "a", "b", "e");
        int max = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("fem")) {
                if (person1[x].getVarsta() > max) {
                    max = x;
                    z = person1[x];
                }
            }
        }
        return z;
    }


    public Person getOldestMen() {
        Person z = new Person(1, "a", "b", "e");
        int max = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("masc")) {
                if (person1[x].getVarsta() > max) {
                    max = x;
                    z = person1[x];
                }
            }
        }
        return z;
    }


    public int womenCount() {
        int count = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("fem")) {
                count++;
            }
        }
        return count;
    }

    public int manCount() {
        int count = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("masc")) {
                count++;
            }
        }
        return count;
    }


    public int averageWomanAge() {
        int av = 0;
        int count = 0;
        int ageSum = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("fem")) {
                ageSum = ageSum + person1[x].getVarsta();
                count++;
                av = ageSum / count;
            }
        }
        return av;
    }


    public int averageMenAge() {
        int av = 0;
        int count = 0;
        int ageSum = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getSex().equals("masc")) {
                ageSum = ageSum + person1[x].getVarsta();
                count++;
                av = ageSum / count;
            }
        }
        return av;
    }

    public int numberOfMarriedPeople() {
        Person z = new Person(1, "a", "b", "e");
        int count = 0;
        for (int x = 0; x < person1.length; x++) {
            if (person1[x].getMarried().equals("yes")) {
                count++;
            }
        }
        return count;
    }




}



