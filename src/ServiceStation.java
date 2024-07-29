public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        vehicle.check();
    }
}
