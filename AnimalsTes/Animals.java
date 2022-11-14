package AnimalsTes;

abstract class Animals{
    private double kg;

    public Animals(){

    }
    abstract String eat();

    abstract String roar();

    public double getKg(){
        return kg;
    };
}
