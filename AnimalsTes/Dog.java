package AnimalsTes;

public class Dog extends Animals implements Resizeable{
    private double kg = 5;



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

    }

//    @Override
//    public double resize(double kg) {
//        return kg - this.kg;
//    }
}
