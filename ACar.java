package selenium;

	public class ACar {
	public void applyBreak() {
		System.out.println("Break");

	}
	public void applyGear() {
		System.out.println("gear");

	}
	public void switchOnAc() {
		System.out.println("ac");


	}
	public void applyAcclerate() {
		System.out.println("acclerate");

	}
	public static void main(String[] args) {
		ACar car=new ACar();
		car.applyBreak();
		car.applyGear();
		car.switchOnAc();
		car.applyAcclerate();
	}
	
	}