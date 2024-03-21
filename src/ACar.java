public abstract class ACar implements Car{
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public int calculateRegistrationFee(int kmPrL) {
        if (kmPrL<5) {
            return 10470;
        }
        else if(kmPrL<10) {
            return 5500;
        }
        else if (kmPrL<15) {
            return 2340;
        }
        else if (kmPrL<20) {
            return 1050;
        }
        return 330;
    }

    @Override
    public String toString() {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
