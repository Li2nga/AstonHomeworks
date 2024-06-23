package StageTwo.List;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> a = new MyArrayList<>();
        a.add(10);
        a.add(15);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        a.add(50);
        System.out.println("a = " + a);
        a.remove(0);
        System.out.println("a = " + a);
        System.out.println("a.get(0) = " + a.get(0));

        System.out.println("a.size() = " + a.size());
        System.out.println("a.dataSize() = " + a.dataSize());
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        a.remove(0);
        System.out.println("a.size() = " + a.size());
        System.out.println("a.dataSize() = " + a.dataSize());
        a.remove(0);
        System.out.println("a.size() = " + a.size());
        System.out.println("a.dataSize() = " + a.dataSize());
        System.out.println("a = " + a);
    }
}
