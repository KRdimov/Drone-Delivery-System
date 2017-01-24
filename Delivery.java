package drone_delivery_system;

import java.util.Map;

public class Delivery {
	private int id;
	private String timeStamp = "2016-10-25 12:31";
	private int[] targetCoordinates = new int[2];
	private Map<Integer,Integer> productId;
	
	public Delivery() {
		this.productId = productId;
	}
	
	public Delivery(int id, String timeStamp, int[] targetCoordinates, Map<Integer, Integer> productId) {
		this.id = id;
		this.timeStamp = timeStamp;
		this.targetCoordinates = targetCoordinates;
		this.productId = productId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Map<Integer, Integer> getProductId() {
		return productId;
	}

	public void setProductId(Map<Integer, Integer> productId) {
		this.productId = productId;
	}	
}
