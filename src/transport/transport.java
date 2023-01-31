package transport;

public abstract class transport <T extends driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public transport(String brand, String model, double engineVolume) {
        this.driver = driver;
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "Нет информации";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "Нет информации";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        }
    public double getEngineVolume() {return engineVolume;}
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
        this.engineVolume = 1.5;}
    }
    public abstract String startMove();
    public abstract String finishMove();

    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public T getDriver() {return driver;}


    @Override
    public String toString() {
        return "Транспортное средство марки " + brand + ", модель " + model + ", объем двигателя " + engineVolume;
    }
}
