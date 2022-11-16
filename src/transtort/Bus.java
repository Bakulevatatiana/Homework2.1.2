package transtort;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    private Capasity Capasity;

    public Bus(String stamp, String model, int productionYear, String assemblyCountry, double maximumMovementSpeed, Capasity Capasity) {
        super(stamp, model, maximumMovementSpeed);
        this.Capasity = Capasity;
    }

    public transtort.Capasity getCapasity() {
        return Capasity;
    }

    public void setCapasity(transtort.Capasity capasity) {
        Capasity = capasity;
    }

    @Override
    public void startMovement() {
        System.out.printf("Aвтобус  %s %s начал движение", this.getStamp(), this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("Aвтобус %s %s закончил движение", this.getStamp(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Aвтобус %s %s сделал остановку", this.getStamp(), this.getModel());
    }

    @Override
    public void BestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }

    @Override
    public void getBestLapTime() {
        System.out.println();
    }

    @Override
    public void maximumMovementSpeed() {
        System.out.println();
    }

    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке");

    }

    @Override
    protected String checkfuelTypeOrDefault(String fuelType) {
        return null;
    }

    @Override
    public void printType() {
        if (Capasity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = LoadCapacity.getFrom() == null ? "" : "от" + LoadCapacity.getFrom() + " ";
            String to = LoadCapacity.getTo() == null ? "" : "до" + LoadCapacity.getTo();
            System.out.println("Вместимость автобуса от" + Capasity.getFrom() + " до " + Capasity.getTo());
        }

    }

    @Override
    public boolean service() {
        System.out.println("Автобус" + getStamp() + "" + getModel() + "в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус" + getStamp() + " " + getModel() + "починин");
    }
}

