package de.awk.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="SP_ClickerEvent")
public class ClickerEvent implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ClickerEvent_NUMMER")
	@SequenceGenerator(name="ClickerEvent_NUMMER", sequenceName="SEQ_ClickerEvent_NUMMER", allocationSize=1)
	private int clickerID;
	private String clickerName;
	private boolean zustandSession;
	
	public boolean isZustandSession() {
		return zustandSession;
	}
	public void setZustandSession(boolean zustandSession) {
		this.zustandSession = zustandSession;
	}
	public int getClickerID() {
		return clickerID;
	}
	public void setClickerID(int clickerID) {
		this.clickerID = clickerID;
	}
	public String getClickerName() {
		return clickerName;
	}
	public void setClickerName(String clickerName) {
		this.clickerName = clickerName;
	}
	
	
}
