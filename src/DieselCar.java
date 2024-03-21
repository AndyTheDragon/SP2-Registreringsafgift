public class DieselCar extends AFuelCar{
    private boolean particleFilter;


    DieselCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre, boolean hasParticleFilter) {
        super(make, model, numberOfDoors, registrationNumber, kmPrLitre);
        this.particleFilter = hasParticleFilter;
    }

    public boolean hasParticleFilter() {
        return this.particleFilter;
    }
    @Override
    public int getRegistrationFee() {
        int fee= calculateRegistrationFee(this.getKmPrLitre());
        if (this.getKmPrLitre()<5) {
            fee+= 15260;
        }
        else if(this.getKmPrLitre()<10) {
            fee+= 2770;
        }
        else if (this.getKmPrLitre()<15) {
            fee+= 1850;
        }
        else if (this.getKmPrLitre()<20) {
            fee+= 1390;
        }
        else {
            fee+= 130;
        }
        fee += this.hasParticleFilter() ? 0 : 1000;
        return fee;
    }


    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", particleFilter=" + particleFilter +
                "\t" + this.getRegistrationFee();
    }
}
