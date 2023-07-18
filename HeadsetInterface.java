package headset;

public interface HeadsetInterface {
	String getBrand();
	String getModel();
	int getVolume();
	boolean getTurnon_off();
	
	void setBrand(String brand);
	void setModel(String model);
	void setVolume(int volume);
	void setTurnon_off(boolean turnon_off);
	
	void turnOn_Off(boolean turnon_off);
	
	void printFreatures();
	void printDetail();
	
}
