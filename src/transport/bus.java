package transport;

public class bus extends transport <driverD> implements competing {

    public bus(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public String startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
        return null;
    }

    @Override
    public String finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
        return null;
    }

    @Override
    public String pitStop() {
        System.out.println("Пит-стоп у автобуса марки " + getBrand());
        return null;
    }

    @Override
    public String bestLapTime() {
        int minBound = 10;
        int maxBound = 20;
        int bestLapTime = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса марки " + getBrand() + ": " + bestLapTime);
        return null;
    }

    @Override
    public String maxSpeed() {
        int minBound = 100;
        int maxBound = 180;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автобуса марки " + getBrand() + ": " + maxSpeed);
        return null;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
