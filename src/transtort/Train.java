package transtort;


public abstract class Train extends Transport {
    private float priceOfTheTrip;
    private double travelTime;
    private String nameOfDepartureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String assemblyCountry, String bodyColor, float priceOfTheTrip, double travelTime, String nameOfDepartureStation, String endingStation, int numberOfWagons, double maximumMovementSpeed, double engineVolumeInLiters) {
        super(brand, model, productionYear, assemblyCountry, bodyColor, maximumMovementSpeed, engineVolumeInLiters);
        setPriceOfTheTrip(priceOfTheTrip);
        setTravelTime(travelTime);
        setNumberOfWagons(numberOfWagons);

        setEndingStation(endingStation);
    }

    public float getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(float priceOfTheTrip) {
        this.priceOfTheTrip = Math.max(priceOfTheTrip, 1);
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }


    public String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        numberOfWagons = numberOfWagons;
    }


    @Override
    public String toString() {
        return "Train{" + "priceOfTheTrip=" + priceOfTheTrip + ", travelTime=" + travelTime + ", nameOfDepartureStation='" + nameOfDepartureStation + '\'' + ", endingStation='" + endingStation + '\'' + ", numberOfWagons=" + numberOfWagons + "} " + super.toString();
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void refill() {
        System.out.println(" нужно заправлять дизелем");
    }
}
