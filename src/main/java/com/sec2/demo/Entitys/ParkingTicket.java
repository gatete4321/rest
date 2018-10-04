package com.sec2.demo.Entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ParkingTicket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
	private ParkedCar pc;
	
    private int fine;
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
	private PoliceOfficer p;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ParkingMeter pm;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ParkedCar getPc() {
		return pc;
	}

	public void setPc(ParkedCar pc) {
		this.pc = pc;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public PoliceOfficer getP() {
		return p;
	}

	public void setP(PoliceOfficer p) {
		this.p = p;
	}

	
}
