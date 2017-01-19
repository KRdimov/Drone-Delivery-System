package drone_delivery_system;

import java.util.HashMap;
import java.util.Map;

public class Warehous {
	private Map<Product, Integer> productsQuantities;

	public Warehous() {
		productsQuantities = new HashMap<>();
	}
	
	public Warehous(Map<Product, Integer> products) {
		this.productsQuantities = products;
	}
	
	public void addProduct(Product product, int quantity) {
		productsQuantities.put(product, quantity);
	}
	
	public int getProductQuantity(int id) {
		for (Map.Entry<Product,Integer> productQuantity : productsQuantities.entrySet()) {
			if(id == productQuantity.getKey().getId()) {
				return productQuantity.getValue();
			}
		}
		return -1;
	}
	
	public Product getProduct(int id) {
		for (Product product : productsQuantities.keySet()) {
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
}
