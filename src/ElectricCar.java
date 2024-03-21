public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public  int getMaxRangeKm() {
        return maxRange;
    }
    public int getWhPrKm() {
        return this.batteryCapacity/this.maxRange;
    }

    @Override
    public int getRegistrationFee() {
        return calculateRegistrationFee(9125/this.getWhPrKm());
    }
}
