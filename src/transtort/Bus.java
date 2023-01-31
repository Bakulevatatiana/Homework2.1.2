package transtort;

public class Bus extends Transport implements Competing {
    private Capasity Capasity;

    public Bus(String brand, String model,double engineVolumeInLiters, int productionYear, String assemblyCountry,
               String bodyColor, double maximumMovementSpeed, Capasity Capasity) {
        super( brand, model,  productionYear,
         assemblyCountry,  bodyColor,
         maximumMovementSpeed,  engineVolumeInLiters);
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
        System.out.printf("Aвтобус  %s %s начал движение", this.getBrand(), this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("Aвтобус %s %s закончил движение", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Aвтобус %s %s сделал остановку", this.getBrand(), this.getModel());
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
    public String checkFuelTypeOrDefault(String fuelType) {
        return null;
    }

    @Override
    public void printType() {
        if (Capasity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {

            System.out.println("Вместимость автобуса от" + Capasity.getFrom() + " до " + Capasity.getTo());
        }

    }

    @Override
    public boolean service() {
        System.out.println("Автобус" + getBrand() + "" + getModel() + "в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус" + getBrand() + " " + getModel() + "починин");
    }
}

