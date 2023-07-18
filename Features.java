package headset;

class Features extends Headset{

	Features(String brand, String model, int volume, boolean turnon_off) {
		super(brand, model, volume, turnon_off);
		// TODO Auto-generated constructor stub
	}

	private String bluetooth="5.3 Bluetooth";
	private String usbCharger="C-Cable";
	private int price=25000;
	private String controlMethod="Touch";
	private String otherFeatures="Call Control, Noise Control, Water Resistance";
	private String color="White";
	
	
	
	public void printFreatures() {
		System.out.println("--Features--");
		
		System.out.println("Bluetooth: "+bluetooth+"\nUSB Charger: "+usbCharger+"\nPrice: "+price+"\nControl Method: "
				+controlMethod+"\nColor: "+color+"\nOther Fratures: "+otherFeatures);
	}


}
