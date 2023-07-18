package headset;

public abstract class Headset implements HeadsetInterface{
	
	private String brand;
	private String model;
	private int volume;
	private boolean turnon_off;
	
	/**
	 * 
	 * @param brand - store brand value from local level to class level  
	 * @param model - store model value from local level to class level
	 * @param volume - store volume value from local level to class level
	 * @param turnon_off - store turning on and off value from local level to class level
	 */
	Headset(String brand,String model,int volume,boolean turnon_off){
		this.brand=brand;
		this.model=model;
		this.volume=volume;
		this.turnon_off=turnon_off;
	}
	
	public String getBrand(){
	return brand;	
	}
	
	public void setBrand(String brand){
		this.brand= brand;
	}
	 
	public String getModel(){
		return model;	
	}
			
	public void setModel(String model){
		this.model= model;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	public boolean getTurnon_off() {
		return turnon_off;
	}
	
	public void setTurnon_off(boolean turnon_off) {
		this.turnon_off=turnon_off;
	}
	
	public void turnOn_Off(boolean turnon_off) {
		if(turnon_off==true) {
			System.out.println("Turnning ON...");
		}
		else {
			System.out.println("Turnning OFF...");
		}
	}
	
	public int volumeIncrease() {
		volume++;
		return volume;
	}
	
	public int volumeDecrease() {
		volume--;
		return volume;
	}
	
	public void printDetail() {
		System.out.println("HeadSet..");
		System.out.println("Brand name: "+getBrand()+"\nModel: "+getModel());
	}
	
}
