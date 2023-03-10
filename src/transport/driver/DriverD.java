package transport.driver;

public class DriverD extends Driver {
    public DriverD(String name, boolean hasDriverLicense, int drivingExperience) {
        super(name, hasDriverLicense, drivingExperience);
    }

    @Override
    public void startMove() { System.out.println("Водитель категории D " + getName() + " начал движение");}
    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " остановился");
    }
    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getName() + " заправил авто");
    }

}
