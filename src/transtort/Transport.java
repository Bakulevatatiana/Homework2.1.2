package transtort;

public abstract class Transport {
    private final   String stamp;
    private final  String model;
    /*private final int productionYear;
    private final String assemblyCountry;*/
    private  String bodyColor;
    private  double maximumMovementSpeed;
    private double engineVolumeInLiters;

    public  Transport(String stamp, String model, double engineVolumeInLiters) {
        this.stamp = stamp;
        this.model = model;
        /*this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;*/
        this.engineVolumeInLiters=engineVolumeInLiters;
    }

   // public Transport(String stamp, String model, int productionYear, String assemblyCountry, String bodyColor, double maximumMovementSpeed,
       //              String fuelType) {
        /*this.stamp =ValidationUtils.validOrDefault(stamp);
        model="default";
        //this.stamp = "default";
        this.model = ValidationUtils.validOrDefault(stamp,default);
        //productionYear=200;
        //assemblyCountry="default";
        this.productionYear = Math.max(productionYear,0);
        this.assemblyCountry = ValidationUtils.validOrDefault(assemblyCountry,default);

        setMaximumMovementSpeed  (maximumMovementSpeed);
        setBodyColor(bodyColor);*/


    public abstract void startMovement();

    public abstract void stopMovement();

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    /*public int getProductionYear() {
        return productionYear;
    }



    public String getAssemblyCountry() {
        return assemblyCountry;
    }*/

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor==null){this.bodyColor="белый";}
        else {


        this.bodyColor = bodyColor;
    }}

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed( double maximumMovementSpeed) {
        if (maximumMovementSpeed==0){this.maximumMovementSpeed=0;}
        else {

        this.maximumMovementSpeed = maximumMovementSpeed;

    }

}
public abstract void refill();
    protected abstract String checkfuelTypeOrDefault (String fuelType);

    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void maximumMovementSpeed();
    public abstract void printType();
    public abstract boolean service();
}
