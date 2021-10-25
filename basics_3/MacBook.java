package basics_3;

public class MacBook implements Computer{
	enum Properties {
			usb_c,
			macOS,
			Apple,
			}
     public  void charge(){
		System.out.println("Charging using ...."+Properties.usb_c);
	}
	
	public void boot() {
		System.out.println("Booting..."+Properties.macOS);
	}
	
	public void shutdown() {
		System.out.println("Shutting Down.." + Properties.macOS);
	}
	
	public void enterBIOS() {
		System.out.println("Entering into BIOS... \n" + Properties.Apple);
	}
	
	public static void main(String[] args) {
		Computer c = new MacBook();
		
		
		c.boot();
		c.enterBIOS();
		c.charge();
		c.shutdown();
		
	}

}
