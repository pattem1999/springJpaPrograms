package com.covalense.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hid;
	
	private String hname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address ad;

	public Hotel(String hname) {
		super();
		this.hname = hname;
	}

	public Hotel(Address ad) {
		super();
		//this.hname = hname;
		this.ad = ad;
	}

	public Hotel(String hname, Address ad) {
		super();
		this.hname = hname;
		this.ad = ad;
	}
	
	
	
}
