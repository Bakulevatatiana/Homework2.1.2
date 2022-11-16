import driver.Driver;
import driver.DriverB;
import jdk.jfr.Category;
import transtort.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Automobile lada = new Automobile("lada ", "Granta", 2015, TypeOfBody.SEDAN);
        lada.addDriver(new DriverB("Иванов Иван Иванович", "C", ) {
        }); Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 2020, TypeOfBody.SEDAN);
        Automobile BMW = new Automobile("BMW", "Z8", 2021, TypeOfBody.HATCHBACK);
        Automobile kia = new Automobile("Kia", "Sportage 4-го поколения", 2018, TypeOfBody.HATCHBACK);
        Automobile hyundai = new Automobile("Hyundai", "Avante", 2016, TypeOfBody.SEDAN);
        Train lastochka = new Train("Ласточка", "B-901", 2011, null, 3500, 0, "отходит от Белорусского вокзала", " до станции Минск-Пассажирский", 11, 301);
        Train leningrad = new Train("Ленинград", "D-125", 2019, null, 1700, 0, "отходит от Ленинградского вокзала", " и следует до станции Ленинград-Пассажирский", 8, 270);
        Bus bus1 = new Bus("Ankai", "GK15", 2020, "Южная Корея", 110, Capasity.MEDIUM);
        Bus bus2 = new Bus("DongFeng", "546", 2021, "Китай", 120, Capasity.LARGE);
        Bus bus3 = new Bus("Golden Dragon", "G-278", 2022, "Германия", 130, Capasity.EXSTRA_LARGE);


        lada.refill();
        lastochka.refill();
        bus3.refill();
        service(lada);
        List<Transport> transports = List.of(lada, audi, BMW);
    }

    private static void service(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].service()) {
                throw new RuntimeException("Автомобиль прошел диагностику");

            }
        }
    }
}





