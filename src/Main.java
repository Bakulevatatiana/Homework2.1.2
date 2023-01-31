import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import transtort.*;
import transtort.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("lada ", "Granta", 2022, "Россия", "серый", 1.7, 2.1, TypeOfBody.SEDAN);


        Sponsor lukoil = new Sponsor("Лукоил", 2000000);
        Mechanic<Car> petr = new Mechanic<Car>("Петр", "Петров", "Качество");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "оранжевый", 120.0, 1.7, TypeOfBody.SEDAN);
        Car BMW = new Car("BMW", "Z8", 2021, "Германия", "оранжевый", 120.0, 1.2, TypeOfBody.HATCHBACK);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Германия", "синий", 120.0, 1.7, TypeOfBody.HATCHBACK);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Китай", "коричневый", 200.0, 1.4, TypeOfBody.SEDAN);
        //Train lastochka = new Train("Ласточка", "B-901", 2011, null, "желтый",90.0 ,60.30,"отходит от Белорусского вокзала", " до станции Минск-Пассажирский"," и следует до станции Ленинград-Пассажирский" , 301,1.5,2.0);
        //Train leningrad = new Train("Ленинград", "D-125", 2019, null, "красный", 89.0, 30.30,"отходит от Ленинградского вокзала", " и следует до станции Ленинград-Пассажирский", 8, 27.0, 1.0);
        Bus bus2 = new Bus("DongFeng", "546", 2021, 2023, "Китай", "красный", 120, Capasity.LARGE);
        Bus bus3 = new Bus("Golden Dragon", "G-278", 2022, 2021, "Германия", "синий", 130, Capasity.EXSTRA_LARGE);
        ArrayList<Driver> drivers = new ArrayList<>();
        Driver denis = new DriverB("Петров Денис Александрович", "B", 3, hyundai);
        Driver<Bus> alexey = new DriverC("Иванов Алексей Иванович", "С", 1, bus2);
        drivers.add(denis);
        drivers.add(alexey);

        lada.addMechanic(petr);
        lada.addSponsor(lukoil);
        lada.refill();
        //lastochka.refill();
        bus3.refill();
        service(lada);
        List<Transport> transports = List.of(lada, audi, BMW);
        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилям" + transport.getBrand() + transport.getModel());
        System.out.println("Водители:" + transport.getDrivers());
        System.out.println("Механики:" + transport.getMechanics());
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }

        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики:");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + "из" + mechanic.getCompany());
        }

    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль прошел диагностику");

            }
        }
    }
}





