package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "work_package")
public class WorkPackage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_wp;
	
	private String fleet ;
	private String ac ;
	private String wp ;
	private String wp_id ;
	private String wp_loc;
	private String wp_status;
	private String wp_n ;
	private String wp_schstdt ;
	private String wp_schenddt;
	private String wp_due;
	
	public WorkPackage() {
		super();
	}

	public WorkPackage(String fleet, String ac, String wp, String wp_id, String wp_loc, String wp_status, String wp_n,
			String wp_schstdt, String wp_schenddt, String wp_due) {
		super();
		this.fleet = fleet;
		this.ac = ac;
		this.wp = wp;
		this.wp_id = wp_id;
		this.wp_loc = wp_loc;
		this.wp_status = wp_status;
		this.wp_n = wp_n;
		this.wp_schstdt = wp_schstdt;
		this.wp_schenddt = wp_schenddt;
		this.wp_due = wp_due;
	}

	public Long getId_wp() {
		return id_wp;
	}

	public void setId_wp(Long id_wp) {
		this.id_wp = id_wp;
	}

	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getWp() {
		return wp;
	}

	public void setWp(String wp) {
		this.wp = wp;
	}

	public String getWp_id() {
		return wp_id;
	}

	public void setWp_id(String wp_id) {
		this.wp_id = wp_id;
	}

	public String getWp_loc() {
		return wp_loc;
	}

	public void setWp_loc(String wp_loc) {
		this.wp_loc = wp_loc;
	}

	public String getWp_status() {
		return wp_status;
	}

	public void setWp_status(String wp_status) {
		this.wp_status = wp_status;
	}

	public String getWp_n() {
		return wp_n;
	}

	public void setWp_n(String wp_n) {
		this.wp_n = wp_n;
	}

	public String getWp_schstdt() {
		return wp_schstdt;
	}

	public void setWp_schstdt(String wp_schstdt) {
		this.wp_schstdt = wp_schstdt;
	}

	public String getWp_schenddt() {
		return wp_schenddt;
	}

	public void setWp_schenddt(String wp_schenddt) {
		this.wp_schenddt = wp_schenddt;
	}

	public String getWp_due() {
		return wp_due;
	}

	public void setWp_due(String wp_due) {
		this.wp_due = wp_due;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
