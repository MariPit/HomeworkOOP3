package transport;

public class train extends transport {

    private int travelPrice;
    private int travelTime;
    private String departureStation;
    private String arrivalStation;
    private int numberOfWagons;

    public train(String brand, String model, int productionYear, String productionCountry,
                 String color, int maxSpeed, int travelPrice, int travelTime,
                 String departureStation, String arrivalStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    setTravelPrice(travelPrice);
    setTravelTime(travelTime);
    setDepartureStation(departureStation);
    setArrivalStation(arrivalStation);
    setNumberOfWagons(numberOfWagons);
    }

    public int getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(int travelPrice) {
        if (travelPrice <= 0) {
            travelPrice = 1000;
        }
        this.travelPrice = travelPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime <= 0) {
            travelTime = 4;
        }
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isEmpty() || departureStation.isBlank()) {
            departureStation = "Московский вокзал";
        }
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null || arrivalStation.isBlank() || arrivalStation.isEmpty()) {
            arrivalStation = "Новгород-Пассажирский";
        }
        this.arrivalStation = arrivalStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            numberOfWagons = 5;
        }
        this.numberOfWagons = numberOfWagons;
    }
    @Override
    public String toString() {
        return super.toString() + ", отходит от станции: " + departureStation + " и следует до станции: " + arrivalStation + ". Цена поездки — " + travelPrice + " рублей, в поезде " + numberOfWagons + " вагонов";
    }

    @Override
    public void refill() {
        System.out.println("Поезда нужно заправлять дизелем.");
    }
}
