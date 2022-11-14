package AnimalsTes;

public class Cat extends Animals implements Resizeable, howToColor{
    private double kg;

    @Override
    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public Cat(double kg) {
        this.kg = kg;
    }


    @Override
    String eat() {
        return "eat bone";
    }

    @Override
    String roar() {
        return "bow wow";
    }

    @Override
    public void resize(double kg) {
       this.kg = getKg() - kg;
    }

    @Override
    public void makeColor() {
        System.out.println("To mong roi to than hinh cua no");
    }
}
