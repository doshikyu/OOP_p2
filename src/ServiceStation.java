public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle == null) return;
        proceedTyreService(vehicle);
        if (vehicle.getClass() == Car.class) {
            Car car = (Car) vehicle;
            car.checkEngine();
        } else if (vehicle.getClass() == Truck.class) {
            Truck truck = (Truck) vehicle;
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    private static void proceedTyreService(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
