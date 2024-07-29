public abstract class Vehicle implements Serviceable {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        if (getWheelsCount() == 0) {
            System.out.println("У этого транспортного средства нет колёс...");
            return;
        }
        for (int i = 0; i < wheelsCount; i++){
            updateTyre();
        }
    }

}
