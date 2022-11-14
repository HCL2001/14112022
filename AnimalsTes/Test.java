package AnimalsTes;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(10);
        System.out.println(cat.getKg());
        cat.resize(5);
        System.out.println(cat.getKg());
    }
}
