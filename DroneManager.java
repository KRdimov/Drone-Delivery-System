package drone_delivery_system;

import java.util.HashMap;
import java.util.Map;

public class DroneManager {
	Map<Drone, Boolean> drones;
	
	public DroneManager() {
		drones = new HashMap<>();
	}
	
	public DroneManager(Map<Drone, Boolean> drones) {
		this.drones = drones;
	}
	
	public void addDrone(Drone drone) {
		drones.put(drone, true);
	}
	
	public int getDrones(float productWeight) {
		int droneCount = 0;
		float weightUnits = 0.0f;
		for (Map.Entry<Drone, Boolean> drone : drones.entrySet()) {
			if(drone.getValue()){
				weightUnits += drone.getKey().getWeightUnits();
				droneCount++;
			}
			if(weightUnits >= productWeight) {
				break;
			}
		}
		if(droneCount > 0 && weightUnits >= productWeight) {
			setBusyDrones(droneCount);
		}
		return weightUnits >= productWeight ? droneCount : -1;
	}
	
	private void setBusyDrones(int droneCount){
		for (Drone drone : drones.keySet()) {
			if(droneCount == 0) {
				break;
			}
			if(drones.get(drone)) {
				drones.put(drone, false);
				droneCount--;
			}
		}
	}
}
