package ctrln;

import java.util.Objects;

public class Person {

    private String cnp;

    public Person (){}//Constructorul Gol

    public Person(String cnp){ //Costructorul normal
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cnp='" + cnp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cnp, person.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }
}
