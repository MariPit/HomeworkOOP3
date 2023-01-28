package transport;

public class car extends transport {

    private double engineVolume;
    private String transmission;
    private final String carBody;
    private String regNamber;
    private final int capacity;
    private boolean summerTires;
    private Key key;

    public static class Key{
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun? "удаленный запуск двигателя":"без удаленного запуска двигателя") +
                    ", " + (withoutAccess? "бесключевой доступ":"бесключевой доступ отсутствует");
        }
    }

    public car(String brand, String model, double engineVolume, String color, int maxSpeed,
               int productionYear, String productionCountry, String transmission,
               String carBody, String regNamber, int capacity, boolean summerTires, Key key) {
        super (brand, model, productionYear, productionCountry, color, maxSpeed);
        if (carBody == null || carBody.isBlank() || carBody.isEmpty()) {
            carBody = "хетчбэк";
        }
        this.carBody = carBody;

        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTires = summerTires;
        setEngineVolume(engineVolume);
        setColor(color);
        setRegNamber(regNamber);
        setTransmission(transmission);
        setKey(key);

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "механическая";
        }
    }

    public String getCarBody() {
        return carBody;
    }

    public String getRegNamber() {
        return regNamber;
    }

    public void setRegNamber(String regNamber) {
        if (regNamber == null || regNamber.isEmpty() || regNamber.isBlank()) {
            regNamber = "x000xx000";
        }
        this.regNamber = regNamber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false,false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTires = false;
        }
        if (month >= 4 && month <= 10) {
            summerTires = true;
        }
    }

    public void car() {
        System.out.println(super.toString() + ", объем двигателя - " + engineVolume
                + ", коробка передач - " + transmission + ", тип кузова - " + carBody + ", регистрационный номер - "
                + regNamber + ", количество мест - " + capacity + ", резина - " + (summerTires ? "летняя" : "зимняя") + ", " + key);
    }

    @Override
    public String toString() {
        return super.toString() + ", объем двигателя - " + engineVolume
                + ", коробка передач - " + transmission + ", тип кузова - " + carBody + ", регистрационный номер - "
                + regNamber + ", количество мест - " + capacity + ", резина - " + (summerTires ? "летняя" : "зимняя") + ", " + key;
    }

    @Override
    public void refill() {
        System.out.println("Автомобили можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }
}