package LessonOne;

public class InappropriateAgeRuntimeException extends IllegalArgumentException {
    public InappropriateAgeRuntimeException() {
    }

    public InappropriateAgeRuntimeException(String s) {
        super(s);
    }
}
