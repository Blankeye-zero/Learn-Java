package basics_3;



public class SurfacePro implements Computer{
	enum Properties {
		usb_B,
		Windows,
		MicroSoft,
		MSDefender,
		}
 public  void charge(){
	System.out.println("Charging using ...."+Properties.usb_B);
}

public void boot() {
	System.out.println("Booting..."+Properties.Windows);
}

public void shutdown() {
	System.out.println("Shutting Down.." + Properties.Windows);
}

public void enterBIOS() {
	System.out.println("Entering into BIOS... \n" + Properties.MicroSoft);
}

public void MSDefender() {
	System.out.println("Perform Security Check" + Properties.MSDefender);
}
public static void main(String[] args) {
	Computer c = new SurfacePro();
	
	c.boot();
	c.enterBIOS();
	c.charge();
	c.shutdown();
}

}
