package transport;

public class trucks extends transport <driverC> implements competing {

    public trucks(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
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
}
