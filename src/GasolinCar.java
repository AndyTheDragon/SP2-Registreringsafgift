public class GasolinCar extends AFuelCar{

    @Override
    public int getRegistrationFee() {
        return calculateRegistrationFee(this.getKmPrLitre());
    }

    @Override
    public String toString() {
        return "GasolinCar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
