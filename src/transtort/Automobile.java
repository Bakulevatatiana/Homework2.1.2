package transtort;

import java.time.LocalDate;

public class Automobile {
    private final String stamp;
    private final String model;
    private double engineVolumeInLiters;
    private String bodyColor;
    private int productionYear;
    private final String assemblyCountry;
    private String gears;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsCount;
    private boolean summerTypes;
    private Key key;
    private Insurance insurance;
    public Automobile(String bodyType, int seatsCount, Object o){
        this.bodyType = bodyType;
        this.seatsCount = seatsCount;
        stamp="default";
        model="default";
        engineVolumeInLiters=1.5;
        bodyColor="белый";
        productionYear=200;
        assemblyCountry="default";
    }
    public Automobile(String stamp,
    String model, int productionYear,String assemblyCountry,String bodyColor,
    double engineVolumeInLiters, Key key,Insurance insurance){

        this.stamp=stamp;
        this.model=model;
        this.engineVolumeInLiters=engineVolumeInLiters;
        this.bodyColor=bodyColor;
        this.productionYear=productionYear;
        this.assemblyCountry=assemblyCountry;
this.gears="механика";
this.registrationNumber="х000хх000";
            this.bodyType="седан";
            this.seatsCount=5;
this.summerTypes= true;
if (key==null) {this.key= new Key();
}
else {this.key= key;}
if (insurance==null) {this.insurance= new Insurance();
        }
        else {this.insurance= insurance;}

    }


    public void characteristic(){
        System.out.println(stamp+ model+engineVolumeInLiters+bodyColor+productionYear
        +assemblyCountry);
    }

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        this.engineVolumeInLiters = engineVolumeInLiters;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears==null){this.gears="механика";}
        else {
        this.gears = gears;
    }}

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber==null){
        this.registrationNumber = "х000хх000";
    }
else {this.registrationNumber=registrationNumber;}}
    public boolean isSummerTypes() {
        return summerTypes;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setSummerTypes(boolean summerTypes) {
        this.summerTypes = summerTypes;
    }

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsCount() {
        return seatsCount;
    }
    public void changTypes(){
        boolean b = summerTypes != summerTypes;//33
    }
    public boolean isCorrectRegistrationNumber(){
        if (registrationNumber.length() !=9){
            return false;
        }
char [] chars=registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1])||!Character.isDigit(chars[2])||!Character.isDigit(chars[3])
                ||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])|| !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }
    public static class Key{
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }
    public static class Insurance{private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance() {
            this(null,10000,null);

        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkExpireDate(){
            if (expireDate.isBefore(LocalDate.now())||expireDate.isEqual(LocalDate.now())){
                System.out.println(" Срочно нужно делать новую страховку");
            }
        }
        public void checkNumber(){
            if (number.length()!=9){
                System.out.println("номер страховни не корректный");
            }
        }

        public Insurance(LocalDate expireDate, double cost, String number) {

            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.cost = cost;


            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

        }}
    }

