public class Truck extends EngineVehicle implements TrailerCheckable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
