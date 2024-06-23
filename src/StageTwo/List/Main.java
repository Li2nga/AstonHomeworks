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

////////////////////////////////////////////////////////////////////////////////////////////////////
        MyLinkedList<Integer> b = new MyLinkedList<>();

        b.add(10);
        b.add(20);
        b.add(40);
        b.add(50);
        System.out.println("b = " + b);
        b.remove(1);
        System.out.println("b = " + b);
    }
}