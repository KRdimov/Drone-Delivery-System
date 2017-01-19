package drone_delivery_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestManager {
	//Testing with examples
	private Map<Product, Integer> products = new HashMap<>();
	private Warehous w;
	private List<Warehous> warehouses = new ArrayList<>();
	private Map<Drone, Boolean> drones = new HashMap<>();
	WarehousManager wm;
	DroneManager dm;
	
	
	
	public void handleDeliveryRequest(Map<Integer, Integer> productsQuantities){
		fillExamples();
		for (Map.Entry<Integer, Integer> productQuantity : productsQuantities.entrySet()) {
			int productId = productQuantity.getKey();
			int quantity = productQuantity.getValue(); 
			if(isRequestExecutable(productId, quantity)){
				System.out.println("Request executed! Product id: " + productId + ", Quantity: " + quantity);
			}
		}
	}

	private boolean isRequestExecutable(int productId, int quantity) {
		if(!wm.checkProductQuantity(productId, quantity)){
			return false;
		}
		float productWeight = wm.getProductWeight(productId, quantity);
		int dronesCount = dm.getDrones(productWeight);
		if(dronesCount > 0) {
			System.out.println(dronesCount);
		}
		return dronesCount != -1;
	}
	
	private void fillExamples() {
		wm = new WarehousManager(warehouses);
		dm = new DroneManager(drones);
		for (int i = 0; i < 10; i++) {
			products.put(new Product(i, "Product" + i, (float)i + 0.5f), i + 10);
		}
		w = new Warehous(products);
		warehouses.add(w);
		for (int i = 0; i < 50; i++) {
			drones.put(new Drone(i, 2000, 0.2f, 5), true);
		}
		
	}
}
