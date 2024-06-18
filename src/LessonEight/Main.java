package LessonEight;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance(23, 34, "nova");
        Singleton d = Singleton.getInstance(21, 19, "nova");
        System.out.println("a" + a);
        System.out.println("d"+ d);
    }
}
