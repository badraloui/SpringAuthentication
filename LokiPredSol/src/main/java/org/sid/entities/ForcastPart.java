package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "forcast_part_needed")
public class ForcastPart implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_fp;
	
	private String part_oem;
	private String class_control;
	private String noun;
	private String tl;
	private String ata;
	private String gest;
	private String pef;
	private String ownr;
	private String fleet;
	private String qty;
	private String material_name;
	private String mand_if;
	
	public ForcastPart() {
		super();
	}
	
	public ForcastPart(String part_oem, String class_control, String noun, String tl, String ata, String gest,
			String pef, String ownr, String fleet, String qty, String material_name, String mand_if) {
		super();
		this.part_oem = part_oem;
		this.class_control = class_control;
		this.noun = noun;
		this.tl = tl;
		this.ata = ata;
		this.gest = gest;
		this.pef = pef;
		this.ownr = ownr;
		this.fleet = fleet;
		this.qty = qty;
		this.material_name = material_name;
		this.mand_if = mand_if;
	}

	public Long getId_fp() {
		return id_fp;
	}

	public void setId_fp(Long id_fp) {
		this.id_fp = id_fp;
	}

	public String getPart_oem() {
		return part_oem;
	}

	public void setPart_oem(String part_oem) {
		this.part_oem = part_oem;
	}

	public String getClass_control() {
		return class_control;
	}

	public void setClass_control(String class_control) {
		this.class_control = class_control;
	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getTl() {
		return tl;
	}

	public void setTl(String tl) {
		this.tl = tl;
	}

	public String getAta() {
		return ata;
	}

	public void setAta(String ata) {
		this.ata = ata;
	}

	public String getGest() {
		return gest;
	}

	public void setGest(String gest) {
		this.gest = gest;
	}

	public String getPef() {
		return pef;
	}

	public void setPef(String pef) {
		this.pef = pef;
	}

	public String getOwnr() {
		return ownr;
	}

	public void setOwnr(String ownr) {
		this.ownr = ownr;
	}

	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getMaterial_name() {
		return material_name;
	}

	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}

	public String getMand_if() {
		return mand_if;
	}

	public void setMand_if(String mand_if) {
		this.mand_if = mand_if;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
