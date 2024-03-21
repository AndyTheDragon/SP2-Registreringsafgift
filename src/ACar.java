public abstract class ACar implements Car{
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    ACar(String make, String model, int numberOfDoors, String registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

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
        return registrationNumber + ", " +
                 make + ", " + model +
                ", " + numberOfDoors + "-dørs";
    }

}
