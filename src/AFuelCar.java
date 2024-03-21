public abstract class AFuelCar extends ACar{
    private int kmPrLitre;

    AFuelCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre) {
        super(make, model, numberOfDoors, registrationNumber);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString()+ ", forbrug: " + kmPrLitre + " km/l";
    }
}
