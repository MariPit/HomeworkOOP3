package transport.driver;

import transport.driver.driver;

public class driverC extends driver {
    public driverC(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " остановился");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getName() + " заправил авто");
    }
}
