package basics_3;

public class Workspace {

	public static void main(String[] args) {
		
		Computer c1 = new MacBook();
		Computer c2 = new SurfacePro();
		Computer c3 = new OryxPro();
		
		c1.boot();
		c2.enterBIOS();
		c3.charge();
		//implementation of generic methods....

	}

}
