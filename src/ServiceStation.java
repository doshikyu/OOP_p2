public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle == null || vehicle.getModelName() == null) {
            return;
        }
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
        if (vehicle.getWheelsCount() == 0) {
            System.out.println("У этого транспортного средства нет колёс...");
        }
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}
