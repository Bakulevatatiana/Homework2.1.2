package transtort;

import java.util.ArrayList;

public abstract class Transport {
    private final String stamp;
    private final String model;
    private String bodyColor;
    private double maximumMovementSpeed;

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    private double engineVolumeInLiters;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();

    public Transport(String stamp, String model, double engineVolumeInLiters) {
        if (stamp == null || stamp.isBlank()) {
            this.stamp = "default";
        } else {
            this.stamp = stamp;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolumeInLiters(engineVolumeInLiters);

    }


    public abstract void startMovement();

    public abstract void stopMovement();

    public static String getStamp() {
        return stamp;
    }

    public static String getModel() {
        return model;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        if (engineVolumeInLiters <= 0) {
            this.engineVolumeInLiters = 1.6;
        } else {
            this.engineVolumeInLiters = engineVolumeInLiters;
        }

    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null) {
            this.bodyColor = "белый";
        } else {


            this.bodyColor = bodyColor;
        }
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        if (maximumMovementSpeed == 0) {
            this.maximumMovementSpeed = 0;
        } else {

            this.maximumMovementSpeed = maximumMovementSpeed;

        }

    }

    public abstract void refill();

    protected abstract String checkfuelTypeOrDefault(String fuelType);

    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void maximumMovementSpeed();

    public abstract void printType();

    public abstract boolean service();

    public void addDriver(Driver<?> driver) {//0.11
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public abstract void repair();
}
