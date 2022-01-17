package state;

import data.Katepe;

public class DeliveryState extends State {

	public DeliveryState(Katepe ktp) {
		super(ktp);
		System.out.println("Name: " + ktp.getName());
		System.out.println("Gender: " + ktp.getGender());
		System.out.println("Birthplace: " + ktp.getBirthPlace());
		System.out.println("Address: " + ktp.getAddress());
		System.out.println("Current Phase: Delivering KTP");
		System.out.println("\n\n\n\n\n");
	}

	@Override
	public void changeState() {
		this.ktp.setState(new FinishState(ktp));
		
	}

}
