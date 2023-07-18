package headset;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Features myheadset=new Features("Apple","AirPod pro",10,true);
		
		myheadset.printDetail();
		
		System.out.println();
		myheadset.printFreatures();	
		
		System.out.println();
		myheadset.turnOn_Off(true);
		
		System.out.println("Volume Increasing: "+myheadset.volumeIncrease());
		
		myheadset.volumeDecrease();
		myheadset.volumeDecrease();
		System.out.println("Volume Decreasing: "+myheadset.volumeDecrease());
	}

	
}
