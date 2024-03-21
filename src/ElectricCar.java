public class ElectricCar extends ACar{
    private int batteryCapacity; //kWh
    private int maxRange; //km

    ElectricCar(String make, String model, int numberOfDoors, String registrationNumber,int battery, int range) {
        super(make, model, numberOfDoors, registrationNumber);
        this.batteryCapacity = battery; //kWh
        this.maxRange = range; //km
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public  int getMaxRangeKm() {
        return maxRange;
    }
    public int getWhPrKm() {
        return (this.batteryCapacity*1000)/this.maxRange;
    }

    @Override
    public int getRegistrationFee() {
        return calculateRegistrationFee(9125/this.getWhPrKm());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                "\t" + this.getRegistrationFee();
    }
}
