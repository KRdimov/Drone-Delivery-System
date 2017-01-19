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
}
