package transport;

public abstract class driver {
    private String name;
    private boolean hasDriverLicense;
    private int drivingExperience;

    public driver(String name, boolean hasDriverLicense, int drivingExperience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

}
