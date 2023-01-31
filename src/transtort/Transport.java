package transtort;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private String assemblyCountry;
    private String bodyColor;
    private double maximumMovementSpeed;
    private double engineVolumeInLiters;
    private final ArrayList<Driver> drivers = new ArrayList<>();
    ;
    private final ArrayList<Mechanic> mechanics = new ArrayList<>();
    private final ArrayList<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, int productionYear,
                     String assemblyCountry, String bodyColor,
                     double maximumMovementSpeed, double engineVolumeInLiters

    ) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = ValidationUtils.validOrDefault(productionYear, 200);
        this.assemblyCountry = assemblyCountry;
        this.bodyColor = ValidationUtils.validOrDefault(bodyColor, ",белый");
        this.maximumMovementSpeed = maximumMovementSpeed;


        setEngineVolumeInLiters(engineVolumeInLiters);

    }

    public abstract void refill();

    protected abstract String checkFuelTypeOrDefault(String fuelType);

    public abstract void startMovement();

    public abstract void stopMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        if (engineVolumeInLiters <= 0) {
            this.engineVolumeInLiters = 1.5;
        } else {
            this.engineVolumeInLiters = engineVolumeInLiters;
        }

    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
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

    public void setAssemblyCountry(String assemblyCountry) {
        this.assemblyCountry = assemblyCountry;
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


    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void maximumMovementSpeed();

    public abstract void printType();

    public abstract boolean service();

    public void addDriver(Driver... driver) {//0.11
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }

    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();
}
