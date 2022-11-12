package driver;

import transtort.Automobile;

public class DriverC extends Driver<Automobile> {
    public DriverC(String fullName, String category, int drivingExperience, Automobile car) {
        super(fullName, category, drivingExperience, car);
    }
}
