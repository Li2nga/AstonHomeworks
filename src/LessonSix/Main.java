package LessonSix;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person(71, "Ivan", 4545454);

        FileOutputStream outputStream = new FileOutputStream("src/LessonSix/save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(person);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/LessonSix/save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        objectInputStream.readObject();

        System.out.println(person);
    }
}