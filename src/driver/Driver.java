package driver;


import transtort.Bus;
import transtort.Competing;
import transtort.Transport;

public abstract class Driver<T extends Transport & Competing> {
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
        this.car.startMovement();

    }


    public void stopMovement() {
        System.out.printf("Водитль %s закончил движение", this.fullName);
        this.car.stopMovement();
    }

    public void refill() {
        System.out.printf("Водитль %s заправляет %s %s", this.fullName, this.car.getBrand(), this.car.getModel());

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
        if (this.car == null) {
            throw new IllegalAccessException("Необходимо указать тип прав");
        }
        this.car = car;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format(fullName + ", " +
                        "стаж вождения:" + drivingExperience + "лет," +
                        " категория:" + category +
                        "Bодитель управляет автомобилем %s и будет учавствовать в заезде %s %s",
                this.fullName, car.getBrand(), car.getModel());
    }
}
