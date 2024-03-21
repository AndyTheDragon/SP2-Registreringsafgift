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
        String output = "";
        for (Car car : fleet) {
            output += car.toString() + "\n";
        }
        output += "\t Total antal biler: " + fleet.size() +" biler \t" + getTotalRegistrationsFeeForFleet();
        return output;
    }
}
