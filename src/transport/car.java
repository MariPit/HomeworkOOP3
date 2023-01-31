package transport;

public class car extends transport <driverB> implements competing {


    public car(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public String startMove() {

        System.out.println("Легковой автомобиль марки " + getBrand() + " начал движение");
        return null;
    }

    @Override
    public String finishMove() {

        System.out.println("Легковой автомобиль марки " + getBrand() + " закончил движение");
        return null;
    }

    @Override
    public String pitStop() {

        System.out.println("Пит-стоп у легкового автомобиля марки " + getBrand());
        return null;
    }

    @Override
    public String bestLapTime() {
        int minBound = 2;
        int maxBound = 5;
        int bestLapTime = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для легкового автомобиля марки " + getBrand() + ": " + bestLapTime);
        return null;
    }

    @Override
    public String maxSpeed() {
        int minBound = 40;
        int maxBound = 210;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость легкового автомобиля марки " + getBrand() + ": " + maxSpeed);
        return null;
    }

    public void car() {
        System.out.println(super.toString());
    }
}