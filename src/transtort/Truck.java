package transtort;

public abstract class Truck extends Transport{
    public Truck (String stamp,
                      String model, double engineVolumeInLiters){

        super(stamp,model, engineVolumeInLiters);}
    @Override
    public void startMovement(){
        System.out.printf("Машина  %s %s начал движение", this.getStamp(),this.getModel());

    }
    @Override
    public void stopMovement() {
        System.out.printf("Машина %s %s закончил движение", this.getStamp(), this.getModel());
    }
    @Override
    public void pitStop() {
        System.out.printf( "Пит стоп для легковой машины");
    }
    @Override
    public void getBestLapTime(){
        System.out.println("Лучшее время круга для легковой машины");}
    @Override
    public void maximumMovementSpeed(){
        System.out.println("Максимальная скорость для легковой машины");
    }}

