package transport;

public class transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "Нет информации";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "Нет информации";
        }
        this.model = model;

        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "Россия";
        }
        this.productionCountry = productionCountry;

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0 ) {
            maxSpeed = 180;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Марка - " + brand + ", модель - " + model + ", " + productionYear + " год выпуска, страна сборки - "
                + productionCountry + ", цвет - " + color + ", максимальная скорость - " + maxSpeed + " км/ч";
    }
}
