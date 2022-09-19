package com.forexservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CurrencyConverter") 

public class CurrencyConverterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fromcountry;
	private String tocountry;
	private double currencyexchangerate;
	
	
	
	public CurrencyConverterEntity() {
		super();
	}
	public CurrencyConverterEntity(String fromcountry, String tocountry, double currencyexchangerate) {
		super();
		this.fromcountry = fromcountry;
		this.tocountry = tocountry;
		this.currencyexchangerate = currencyexchangerate;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromcountry() {
		return fromcountry;
	}



	public void setFromcountry(String fromcountry) {
		this.fromcountry = fromcountry;
	}



	public String getTocountry() {
		return tocountry;
	}



	public void setTocountry(String tocountry) {
		this.tocountry = tocountry;
	}
	public double getCurrencyexchangerate() {
		return currencyexchangerate;
	}

	public void setCurrencyexchangerate(double currencyexchangerate) {
		this.currencyexchangerate = currencyexchangerate;
	}
}	
	
	





