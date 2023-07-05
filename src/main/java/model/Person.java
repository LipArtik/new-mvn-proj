package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private String lName;
    private int age;
    private Cat cat;

    public Person(int id, String name, String lName, int age) {
        this.id = id;
        this.name = name;
        this.lName = lName;
        this.age = age;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && name.equals(person.name) && lName.equals(person.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lName, age);
    }
}