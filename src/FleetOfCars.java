import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public void addCar(Car car) {
        this.fleet.add(car);
    }

    public int getTotalRegistrationsFeeForFleet() {
        double sum = 0.0;
        for (Car car : fleet) {
            sum += car.getRegistrationsFee();
        }
    }

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleet=" + fleet +
                '}';
    }
}
