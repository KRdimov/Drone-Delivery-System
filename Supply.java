package drone_delivery_system;

import java.util.Map;

public class Supply {
	private int id;
	private String timeStamp;
	private Map<Integer,Integer> productQuantities;
	
	public Supply() {
		this.productQuantities = productQuantities;
	}
	
	public Supply(int id, String timeStamp, Map<Integer, Integer> productQuantities) {
		this.id = id;
		this.timeStamp = timeStamp;
		this.productQuantities = productQuantities;
	}

	public int getId() {
		return id;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public Map<Integer, Integer> getProductQuantities() {
		return productQuantities;
	}
	
}
