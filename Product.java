package drone_delivery_system;

public class Product {
	private int id;
	private String name;
	private float weight;
	
	public Product(int id, String name, float weight) {
		setId(id);
		setName(name);
		setWeight(weight);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
