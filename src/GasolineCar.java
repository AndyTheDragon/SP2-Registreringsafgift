public class GasolineCar extends AFuelCar{

    GasolineCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre) {
        super(make, model, numberOfDoors, registrationNumber, kmPrLitre);
    }

    @Override
    public int getRegistrationFee() {
        return calculateRegistrationFee(this.getKmPrLitre());
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t" + this.getRegistrationFee();
    }
}
