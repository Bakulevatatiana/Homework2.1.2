package transtort;

public abstract class Truck extends Transport {
    private LoadCapacity LoadCapacity;

    public Truck(String stamp,
                 String model, double engineVolumeInLiters, LoadCapacity LoadCapacity) {

        super(stamp, model, engineVolumeInLiters);
        this.LoadCapacity = LoadCapacity;
    }

    public transtort.LoadCapacity getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(transtort.LoadCapacity loadCapacity) {
        LoadCapacity = loadCapacity;
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина  %s %s начал движение", this.getStamp(), this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("Машина %s %s закончил движение", this.getStamp(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Пит стоп для легковой машины");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга для легковой машины");
    }

    @Override
    public void maximumMovementSpeed() {
        System.out.println("Максимальная скорость для легковой машины");
    }

    @Override
    public void printType() {
        if (LoadCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = LoadCapacity.getFrom() == null ? "" : "от" + LoadCapacity.getFrom() + " ";
            String to = LoadCapacity.getTo() == null ? "" : "до" + LoadCapacity.getTo();
            System.out.println("Грузоподъемность авто" + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик" + getStamp() + " " + getModel() + "починин!");
    }
}

