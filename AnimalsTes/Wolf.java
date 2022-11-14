package AnimalsTes;

public class Wolf extends Animals{
    private double kg = 5;


    @Override
    String eat() {
        return "eat bone";
    }

    @Override
    String roar() {
        return "bow wow";
    }

//    @Override
//    public double resize(double kg) {
//        return kg - super(kg);
//    }
}
