package driver;

import transtort.Transport;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }
    public void startMovement(){
        System.out.printf("Водитль %s начал движение", this.fullName);
        this.startMovement();

    }
    public void stopMovement(){
        System.out.printf("Водитль %s закончил движение", this.fullName);
        this.stopMovement();}
    public void refill(){
        System.out.printf("Водитль %s заправляет %s %s", this.fullName,this.getStamp(),this.getModel());}

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Bодитель управляет автомобилем %s и будет учавствовать в заезде %s %s",
                 this.fullName, this.automobile.getStamp(),this.automobile.getModel());

    }
}
