package LessonOne;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyClassImpl.class.getClassLoader());
        System.out.println(MyClassImpl.class.getName());
        MyClass a = new MyClassImpl();
    }
}