package Abstraction;

public class VehicleAbstractTest {
	public static void main(String[] args) {
		VehicleAbstract my2Wheeler = new XeHaiBanh();
		VehicleAbstract my4Wheeler = new XeBonBanh();
		
		my2Wheeler.start();
		my2Wheeler.stop();
		
		my4Wheeler.start();
		my4Wheeler.stop();
	}

}
