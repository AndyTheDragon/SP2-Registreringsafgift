import util.FileIO;

public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(new DieselCar("Audi", "Q4", 5
                , "CV66586", 18, true));
        fleet.addCar(new DieselCar("Audi", "T8", 3
                , "CV12435", 13, true));
        fleet.addCar(new GasolineCar("VW", "T-Roc", 5
                , "DX43667", 22));
        fleet.addCar(new GasolineCar("VW", "Taigo", 5
                , "DX32775", 9));
        fleet.addCar(new ElectricCar("VW", "ID-4", 5
                    , "BZ14225", 44, 400));
        System.out.println(fleet);
        fleet.saveFleetToFile();




    }
}