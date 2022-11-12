import transtort.Automobile;
import transtort.Bus;
import transtort.Train;
import transtort.Transport;

public class Main {
    public static void main(String[] args) {
        Automobile automobile1= new Automobile("Lada ","Granta", 2015);
        Automobile automobile2= new Automobile("Audi", "A8 50 L TDI quattro", 2020);
        Automobile automobile3= new Automobile("BMW","Z8" , 2021);
        Automobile automobile4= new Automobile("Kia","Sportage 4-го поколения"  , 2018 );
        Automobile automobile5= new Automobile("Hyundai", "Avante", 2016 );
        Train lastochka = new Train ("Ласточка" , "B-901", 2011,null, 3500 , 0,"отходит от Белорусского вокзала", " до станции Минск-Пассажирский",11,301 );
        Train Leningrad=new Train("Ленинград", "D-125", 2019, null,1700,0,  "отходит от Ленинградского вокзала"," и следует до станции Ленинград-Пассажирский",8, 270);
Bus bus1= new Bus("Ankai","GK15",2020,"Южная Корея",110);
 Bus bus2=new Bus("DongFeng","546",2021,"Китай", 120);
 Bus bus3=new Bus("Golden Dragon","G-278",2022, "Германия", 130);
 /*automobile1.characteristic();
        automobile2.characteristic();
        automobile3.characteristic();
        automobile4.characteristic();
        automobile5.characteristic();
        printInfo(automobile1);
        printInfo(automobile2);
        printInfo(automobile3);

        printInfo(automobile4);
        printInfo(automobile5);*/
        automobile1.refill();
        lastochka.refill();
        bus3.refill();
    }
    /*private static void printInfo(Automobile automobile ){
        System.out.println( automobile.getStamp()+" "+ automobile.getModel()+" год выпуска"+
                automobile.getProductionYear()+ automobile.getAssemblyCountry()+automobile.getBodyColor()
                +"литра"+ automobile.getEngineVolumeInLiters()+automobile.getGears()+automobile.getBodyType()+ automobile.getGears()+
                automobile.getRegistrationNumber()+automobile.getSeatsCount()+
                automobile.isSummerTypes()+
                (automobile.getKey().isWithoutKeyAccess()?"безключевой доступ ":"ключевой доступ")+
                (automobile.getKey().isRemoteRunEngine()?"удаленный запуск ":"не удаленный запуск")
        +
               "номер страховки"+ automobile.getInsurance().getNumber()+
                "стоимость страховки"+automobile.getInsurance().getCost()+
        "срок действия страховки"+automobile.getInsurance().getExpireDate());

}*/}