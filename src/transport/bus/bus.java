package transport.bus;

import transport.driver.driver;
import transport.driver.driverD;
import transport.transport;

public class bus extends transport <driverD>  {

    private Capacity capacity;
    public bus(String brand, String model, double engineVolume, driver driverD, Capacity capacity) {
        super(brand, model, engineVolume, (transport.driver.driverD) driverD);
        this.capacity = capacity;
    }

    @Override
    public String startMove() {
        return "Автобус марки " + getBrand() + " начал движение";
    }

    @Override
    public String finishMove() {
        return "Автобус марки " + getBrand() + " закончил движение";
    }

    @Override
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        } else {
            System.out.println("Данных не достаточно");
        }
    }

    @Override
    public String pitStop() {
        return "Пит-стоп у автобуса марки " + getBrand();
    }

    @Override
    public String bestLapTime() {
        int minBound = 10;
        int maxBound = 20;
        int bestLapTime = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Лучшее время круга для автобуса марки " + getBrand() + ": " + bestLapTime;
    }

    @Override
    public String maxSpeed() {
        int minBound = 100;
        int maxBound = 180;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        return "Максимальная скорость автобуса марки " + getBrand() + ": " + maxSpeed;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
