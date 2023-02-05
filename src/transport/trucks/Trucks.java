package transport.trucks;

import transport.driver.Driver;
import transport.driver.DriverC;
import transport.Transport;

public class Trucks extends Transport<DriverC> {

    private LoadCapacity loadCapacity;
    public Trucks(String brand, String model, double engineVolume, Driver driverC, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, (DriverC) driverC);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String startMove() {
        return "Грузовой автомобиль марки " + getBrand() + " начал движение";
    }

    @Override
    public String finishMove() {
        return "Грузовой автомобиль марки " + getBrand() + " закончил движение";
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных не достаточно");
        }
    }

    @Override
    public String pitStop() {
        return "Пит-стоп у грузового автомобиля марки " + getBrand();
    }

    @Override
    public String bestLapTime() {
        int minBound = 5;
        int maxBound = 15;
        int bestLapTime = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Лучшее время круга для грузового автомобиля марки " + getBrand() + ": " + bestLapTime;
    }

    @Override
    public String maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Максимальная скорость грузового автомобиля марки " + getBrand() + ": " + maxSpeed;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
