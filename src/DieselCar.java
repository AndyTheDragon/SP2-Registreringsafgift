public class DieselCar extends AFuelCar{
    private boolean particleFilter;
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
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
