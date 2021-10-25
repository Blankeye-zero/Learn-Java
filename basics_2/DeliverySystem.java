package basics_2;

import java.util.Scanner;

//Using abstraction and polymorphism...

public class DeliverySystem {

	public static void main(String[] args) throws Exception {

		System.out.println("Delivery System Initiated...");
		Delivery indDvry = new IndianDelivery();
		Delivery ausDvry = new AussieDelivery();
		Delivery usaDvry = new AmericanDelivery();
		Delivery swssDvry = new SwissDelivery();
		System.out.println("\n1.India \n2.America \n3.Australia \n4.Switzerland \nChoose your location:");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.close();
		switch (option) {
		case 1:
			indDvry.doDelivery();
			break;
		case 2:
			usaDvry.doDelivery();
			break;
		case 3:
			ausDvry.doDelivery();
			break;
		case 4:
			swssDvry.doDelivery();
			break;
		default:
			System.out.println("Please choose the correct choice");
			break;

		}

	}

}

abstract class Delivery {
	protected float price = 10f;
	protected String country;
	protected abstract void doDelivery();
}

class IndianDelivery extends Delivery {
	float IndianPriceConverter(float p) {
		return p * 75f;
	}

	@Override

	public void doDelivery() {
		super.country="Indian";
		System.out.println(country+" Delivery System...");
		System.out.println("You are required to pay: " + IndianPriceConverter(super.price) + "INR");
	}

}

class SwissDelivery extends Delivery {
	float SwissPriceConverter(float p) {
		return p * 0.92f;
	}

	@Override
	public void doDelivery() {
		super.country="Switzerland ";
		System.out.println(country+" Delivery System...");
		System.out.println("You are required to pay: " + SwissPriceConverter(super.price) + "CHF");
	}

}

class AmericanDelivery extends Delivery {
	@Override
	public void doDelivery() {
		super.country="American ";
		System.out.println(country+" Delivery System...");
		System.out.println("Your are required to pay:" + super.price + "DLR");
	}

}

class AussieDelivery extends Delivery {
	float AusPriceConverter(float p) {
		return p * 1.34f;
	}

	@Override
	public void doDelivery() {
		super.country="Australian";
		System.out.println(country+" Delivery System...");
		System.out.println("You are required to pay: " + AusPriceConverter(super.price) + "AUSDLR");
	}

}