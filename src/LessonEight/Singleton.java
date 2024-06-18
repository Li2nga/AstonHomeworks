package LessonEight;

public class Singleton {
    private static Singleton instance;
    private int date;
    private int version;
    private String model;

    private Singleton(int date, int version, String model) {
        this.date = date;
        this.version = version;
        this.model = model;
    }

    public static Singleton getInstance(int date, int version, String model) {
        if (instance == null) {
            instance = new Singleton(date, version, model);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "date=" + date +
                ", version=" + version +
                ", model='" + model + '\'' +
                '}';
    }
}