import transtort.Automobile;

public class Main {
    public static void main(String[] args) {
        Automobile automobile1= new Automobile("Lada ","Granta", 2015, "сборка в России", "желтого цвета",1.7);
        Automobile automobile2= new Automobile("Audi", "A8 50 L TDI quattro", 2020, "сборка в Германии", "черный цвет",  3.0);
        Automobile automobile3= new Automobile("BMW","Z8" , 2021, "сборка в Германии" , "черный цвет кузова",  3.0);
        Automobile automobile4= new Automobile("Kia","Sportage 4-го поколения"  , 2018 , "сборка в Южной Корее", "цвет кузова — красный",  2.4);
        Automobile automobile5= new Automobile("Hyundai", "Avante", 2016,"сборка в Южной Корее", "цвет кузова — оранжевый",  1.6 );


        automobile1.characteristic();
        automobile2.characteristic();
        automobile3.characteristic();
        automobile4.characteristic();
        automobile5.characteristic();
        printInfo(automobile1);
        printInfo(automobile2);
        printInfo(automobile3);

        printInfo(automobile4);
        printInfo(automobile5);

    }
    private static void printInfo(Automobile automobile ){
        System.out.println( automobile.getStamp()+" "+ automobile.getModel()+" год выпуска"+
                automobile.getProductionYear()+ automobile.getAssemblyCountry()+automobile.getBodyColor()
                +"литра"+ automobile.getEngineVolumeInLiters()+automobile.getGears()+automobile.getBodyType()+ automobile.getGears()+ automobile.getRegistrationNumber()+automobile.getSeatsCount()+ automobile.isSummerTypes());
    }
}