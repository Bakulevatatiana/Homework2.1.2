package driver;


import transtort.Transport;

import java.sql.SQLOutput;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private String category;
    private final int drivingExperience;
    private T car;

    protected Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        setCategory(category);
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    private void setCategory(String category) {
    }

    public void startMovement() {
        System.out.printf("Водитль %s начал движение", this.fullName);
        this.startMovement();

    }

    public void stopMovement() {
        System.out.printf("Водитль %s закончил движение", this.fullName);
        this.stopMovement();
    }

    public void refill() {
        System.out.printf("Водитль %s заправляет %s %s", this.fullName, Transport.getStamp(), Transport.getModel());
    }

    public void haveCategory() {

    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public void setCar(T car) throws IllegalAccessException {
        if (car == null) {
            throw new IllegalAccessException("Необходимо указать тип прав");//14
        }
        this.car = this.car;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Bодитель управляет автомобилем %s и будет учавствовать в заезде %s %s",
                this.fullName, Transport.getStamp(), Transport.getModel());

    }
}
