package transtort;


public abstract class Automobile extends Transport implements Competing {
    private TypeOfBody TypeOfBody;
    //*private double engineVolumeInLiters;
//    private String gears;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int seatsCount;
//    private boolean summerTypes;
    //   private Key key;
    // private Insurance insurance;
//    public Automobile(String bodyType, int seatsCount, Object o, String stamp,String model,int productionYear,String assemblyCountry){
//         super(stamp,model,productionYear,assemblyCountry);
//        this.bodyType = bodyType;
//        this.seatsCount = seatsCount;
//        this.engineVolumeInLiters=1.5;
//    }
    public Automobile(String stamp,
                      String model, double engineVolumeInLiters,TypeOfBody TypeOfBody){

        super(stamp,model, engineVolumeInLiters);
    this.TypeOfBody=TypeOfBody; }

    public transtort.TypeOfBody getTypeOfBody() {
        return TypeOfBody;
    }

    public void setTypeOfBody(transtort.TypeOfBody typeOfBody) {
        TypeOfBody = typeOfBody;
    }

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
            System.out.println("Пит стоп для легковой машины");
        }
        @Override
        public void getBestLapTime(){
            System.out.println("Лучшее время круга для легковой машины");}
            @Override
            public void maximumMovementSpeed(){
                System.out.println("Максимальная скорость для легковой машины");
            }

    @Override
    public void printType() {
        if (TypeOfBody==null){
            System.out.println("Данных по авто недостаточно");
    }
        else {
            System.out.println("Тип кузова авто"+TypeOfBody);}

}

    @Override
    public boolean service() {
        return Math.random()>0.7;
    }
}

       /* this.engineVolumeInLiters=engineVolumeInLiters;

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




    public void characteristic  (){
        System.out.println(stamp+ model+productionYear+assemblyCountry+bodyColor+
        +engineVolumeInLiters);
    }

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        this.engineVolumeInLiters = engineVolumeInLiters;
    }

    public Key getKey() {
        return key;
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
    public void refill(){
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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

        }}*/


