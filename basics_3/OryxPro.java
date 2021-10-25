package basics_3;



public class OryxPro implements Computer{
	enum Properties {
		usb_B,
		LinuxMint,
		System76,
		}
 public  void charge(){
	System.out.println("Charging using ...."+Properties.usb_B);
}

public void boot() {
	System.out.println("Booting..."+Properties.LinuxMint);
}

public void shutdown() {
	System.out.println("Shutting Down.." + Properties.LinuxMint);
}

public void enterBIOS() {
	System.out.println("Entering into BIOS... \n" + Properties.System76);
}

public static void main(String[] args) {
	Computer c = new OryxPro();
	
	c.boot();
	c.enterBIOS();
	c.charge();
	c.shutdown();
}

}
