import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public void addCar(Car car) {
        this.fleet.add(car);
    }

    public int getTotalRegistrationsFeeForFleet() {
        int sum = 0;
        for (Car car : fleet) {
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleet=" + fleet +
                '}';
    }
}
