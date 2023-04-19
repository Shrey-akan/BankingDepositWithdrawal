package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentRendererTokenTypes;

@Entity
public class Deposite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accid;
	private String accname;
	private double accbal;
	
	public Deposite() {
		super();
		
	}
	public Deposite(int accid, String accname, double accbal) {
		super();
		this.accid = accid;
		this.accname = accname;
		this.accbal = accbal;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	@Override
	public String toString() {
		return "Deposite [accid=" + accid + ", accname=" + accname + ", accbal=" + accbal + "]";
	}
	
	
	
	
}
