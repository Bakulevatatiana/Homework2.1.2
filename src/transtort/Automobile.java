package transtort;


public abstract class Automobile extends Transport implements Competing {
    private TypeOfBody TypeOfBody;


    public Automobile(String stamp,
                      String model, double engineVolumeInLiters, TypeOfBody TypeOfBody) {

        super(stamp, model, engineVolumeInLiters);
        this.TypeOfBody = TypeOfBody;
    }

    public transtort.TypeOfBody getTypeOfBody() {
        return TypeOfBody;
    }

    public void setTypeOfBody(transtort.TypeOfBody typeOfBody) {
        TypeOfBody = typeOfBody;
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
        System.out.println("Пит стоп для легковой машины");
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
        System.out.println("Машина" + getStamp() + " " + getModel() + "починина");
    }
}

















