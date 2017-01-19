package drone_delivery_system;

public class Drone {
	private int id;
	private int batteryUnits;
	private float weightUnits;
	private int batteryChargeRate;
	
	public Drone(int id, int batteryUnits, float weightUnits, int batteryChargeRate) {
		setId(id);
		setBatteryUnits(batteryUnits);
		setWeightUnits(weightUnits);
		setBatteryChargeRate(batteryChargeRate);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBatteryUnits() {
		return batteryUnits;
	}
	public void setBatteryUnits(int batteryUnits) {
		this.batteryUnits = batteryUnits;
	}
	public float getWeightUnits() {
		return weightUnits;
	}
	public void setWeightUnits(float weightUnits) {
		this.weightUnits = weightUnits;
	}
	public int getBatteryChargeRate() {
		return batteryChargeRate;
	}
	public void setBatteryChargeRate(int batteryChargeRate) {
		this.batteryChargeRate = batteryChargeRate;
	}
}
