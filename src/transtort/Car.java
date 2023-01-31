package transtort;


import driver.Driver;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport implements Competing {
    private final TypeOfBody TypeOfBody;


    public Car(String brand, String model, int productionYear,
               String assemblyCountry, String bodyColor,
               double maximumMovementSpeed, double engineVolumeInLiters, TypeOfBody TypeOfBody) {

        super(brand, model, productionYear,
                assemblyCountry, bodyColor,
                maximumMovementSpeed, engineVolumeInLiters);
        this.TypeOfBody = TypeOfBody;
    }

    @Override
    public void refill() {

    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        return null;
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина  %s %s начал движение", this.getBrand(), this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("Машина %s %s закончил движение", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп для легковой машины");
    }

    @Override
    public void BestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга для легковой машины");
    }

    public transtort.TypeOfBody getTypeOfBody() {
        return TypeOfBody;
    }

    @Override
    public void maximumMovementSpeed() {
        System.out.println("Максимальная скорость для легковой машины");
    }

    @Override
    public void printType() {
        if (TypeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто" + TypeOfBody);
        }

    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина" + getBrand() + " " + getModel() + "починина");
    }
}

















