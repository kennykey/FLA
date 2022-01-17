package data;

import state.State;

public class Katepe {
	
	String name;
	String gender;
	String birthPlace;
	String address;
	
	State state;
	
	public Katepe(String name, String gender, String birthPlace, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthPlace = birthPlace;
		this.address = address;
	}
	
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
