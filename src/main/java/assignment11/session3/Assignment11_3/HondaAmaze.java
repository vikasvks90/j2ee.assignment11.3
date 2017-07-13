package assignment11.session3.Assignment11_3;

public class HondaAmaze implements Car{
	private String engineType;
	private String engineCapacity;
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public void drive() {
			System.out.println("Driving HondaAmaze!!!");
			System.out.println("Engine Type is: "+getEngineType());
			System.out.println("Engine Capacity is: "+getEngineCapacity());
	}

}
