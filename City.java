package drone_delivery_system;

public class City {
	int cityId;
	String name;
	int[][] cordinate;
	
	public City(String name){
		setName(name);
		setCordinate(new int[1000][1000]);
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[][] getCordinate() {
		return cordinate;
	}

	public void setCordinate(int[][] cordinate) {
		this.cordinate = cordinate;
	}
	
	
}
