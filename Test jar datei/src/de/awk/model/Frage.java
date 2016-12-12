package de.awk.model;

public abstract class Frage {
	private int frageID;
	private String frage;
	
	
	public Frage(String frage) {
		this.frage = frage;
	}
	public int getFrageID() {
		return frageID;
	}
	public void setFrageID(int frageID) {
		this.frageID = frageID;
	}
	public String getFrage() {
		return frage;
	}
	public void setFrage(String frage) {
		this.frage = frage;
	}
	
	
}
