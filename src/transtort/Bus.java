package transtort;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    public Bus(String stamp, String model, int productionYear, String assemblyCountry, double maximumMovementSpeed) {
        super(stamp, model, maximumMovementSpeed);
    }
    @Override
    public void startMovement(){
        System.out.printf("Aвтобус  %s %s начал движение", this.getStamp(),this.getModel());

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
 public void getBestLapTime(){
    System.out.println();
}
    @Override
    public void maximumMovementSpeed(){System.out.println();}

        public void refill() {
            System.out.println("можно заправлять бензином или дизелем на заправке");
        }
    }
