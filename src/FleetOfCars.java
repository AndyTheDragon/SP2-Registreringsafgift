import util.FileIO;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();
    private FileIO io = new FileIO();
    private String savePath = "data/cars.csv";

    public void saveFleetToFile() {
        String header = "Registration, Make, Model, Doors, kmPrLitre, ParticleFilter, BatterySize, Range";
        ArrayList<String> dataList = new ArrayList<>();
        for (Car car : fleet) {
            String data = car.toCSV();
            dataList.add(data);
        }
        io.saveData(header, dataList,savePath);
    }

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
