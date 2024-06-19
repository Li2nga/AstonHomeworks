package StageOne.LessonSix;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    public int age;
    public String name;
    public int passportID;

    public Person(int age, String name, int passportID) {
        this.age = age;
        this.name = name;
        this.passportID = passportID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passportID=" + passportID +
                '}';
    }
}
