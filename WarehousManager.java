package drone_delivery_system;

import java.util.ArrayList;
import java.util.List;

public class WarehousManager {
	List<Warehous> warehouses;	

	public WarehousManager() {
		warehouses = new ArrayList<>();
	}
	
	public WarehousManager(List<Warehous> warehouses) {
		this.warehouses = warehouses;
	}
	
	public void addWarehous(Warehous warehous) {
		warehouses.add(warehous);
	}
	
	public boolean checkProductQuantity(int id, int quantity){
		int warehousProductQuantity = 0;
		for (Warehous warehous : warehouses) {
			warehousProductQuantity += warehous.getProductQuantity(id);
		}
		return warehousProductQuantity > quantity;
	}
	
	public float getProductWeight(int id, int quantity) {
		Product p = null;
		float productWeight = 0.0f;
		for (Warehous warehous : warehouses) {
			p = warehous.getProduct(id);
			if(p != null) {
				break;
			}
		}
		if(p == null) {
			return -1.0f;
		}
		for (int i = 0; i < quantity; i++) {
			productWeight += p.getWeight();
		}
		return productWeight;
	}
}
