package transport.car;

import transport.driver.driver;
import transport.driver.driverB;
import transport.transport;

public class car extends transport<driverB> {

    private BodyType bodyType;

    public car(String brand, String model, double engineVolume, driver driverB, BodyType bodyType) {
        super(brand, model, engineVolume, (transport.driver.driverB) driverB);
        this.bodyType = bodyType;
    }

    @Override
    public String startMove() {
        return "Легковой автомобиль марки " + getBrand() + " начал движение";
    }

    @Override
    public String finishMove() {
        return "Легковой автомобиль марки " + getBrand() + " закончил движение";
        }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных не достаточно");
        }
    }

    @Override
    public String pitStop() {
        return "Пит-стоп у легкового автомобиля марки " + getBrand();
    }

    @Override
    public String bestLapTime() {
        int minBound = 2;
        int maxBound = 5;
        int bestLapTime = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Лучшее время круга для легкового автомобиля марки " + getBrand() + ": " + bestLapTime;
    }

    @Override
    public String maxSpeed() {
        int minBound = 40;
        int maxBound = 210;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Максимальная скорость легкового автомобиля марки " + getBrand() + ": " + maxSpeed;
    }

    public void car() {
        System.out.println(super.toString());
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}