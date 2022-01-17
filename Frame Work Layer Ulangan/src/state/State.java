package state;

import data.Katepe;

public abstract class State {
	
	Katepe ktp;

	public State(Katepe ktp) {
		super();
		this.ktp = ktp;
	}
	
	public abstract void changeState();

}
