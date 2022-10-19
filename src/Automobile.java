public class Automobile {
    String stamp;
    String model;
    double engineVolumeInLiters;
    String bodyColor;
    int productionYear;
    String assemblyCountry;
    Automobile(){
        stamp="default";
        model="default";
        engineVolumeInLiters=1.5;
        bodyColor="белый";
        productionYear=200;
        assemblyCountry="default";
    }
    Automobile(String stamp,
    String model, int productionYear,String assemblyCountry,String bodyColor,
    double engineVolumeInLiters){
        this.stamp=stamp;
        this.model=model;
        this.engineVolumeInLiters=engineVolumeInLiters;
        this.bodyColor=bodyColor;
        this.productionYear=productionYear;
        this.assemblyCountry=assemblyCountry;
    }
    void characteristic(){
        System.out.println(stamp+ model+engineVolumeInLiters+bodyColor+productionYear
        +assemblyCountry);
    }
}
