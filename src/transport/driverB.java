package transport;

public class driverB extends driver{
    public driverB(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getName() + " остановился");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории В " + getName() + " заправил авто");
    }

    }
