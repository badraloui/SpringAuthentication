package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "shared_wp_ot_availability")
public class SharedAvailability implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_shared_availability;
	
	private String op;
	private String totboh;
	private String autres;
	private String qty;
	private String part_oem;
	private String cc;
	private String noun;
	private String tl;
	private String ata;
	private String gest;
	private String pef;
	private String ownr;
	private String jic_id;
	private String cdgm380;
	private String sourcing_cdgm380;
	private String cdgm145;
	private String sourcing_cdgm145;
	private String orym900;
	private String sourcing_orym900;
	private String cdgm247;
	private String sourcing_cdgm247;
	private String cdgm161;
	private String sourcing_cdgm161;
	private String cdgm090;
	private String sourcing_cdgm090;
	private String tlsm031;
	private String sourcing_tlsm031;
	private String xybm902;
	private String sourcing_xybm902;
	private String vlrm800 ;
	private String sourcing_vlrm800;
	private String cdgm500;  
	private String sourcing_cdgm500;
	private String orym179;
	private String sourcing_orym179;
	private String cdgm272;
	private String sourcing_cdgm272;
	private String cdgm344;
	private String sourcing_cdgm344;
	private String orym354;
	private String sourcing_orym354;
	private String cdgm349;
	private String sourcing_cdgm349;
	private String cdgm348;
	private String sourcing_cdgm348;
	private String orym700;
	
	public SharedAvailability() {
		super();
	}

	public SharedAvailability(String op, String totboh, String autres, String qty, String part_oem, String cc,
			String noun, String tl, String ata, String gest, String pef, String ownr, String jic_id, String cdgm380,
			String sourcing_cdgm380, String cdgm145, String sourcing_cdgm145, String orym900, String sourcing_orym900,
			String cdgm247, String sourcing_cdgm247, String cdgm161, String sourcing_cdgm161, String cdgm090,
			String sourcing_cdgm090, String tlsm031, String sourcing_tlsm031, String xybm902, String sourcing_xybm902,
			String vlrm800, String sourcing_vlrm800, String cdgm500, String sourcing_cdgm500, String orym179,
			String sourcing_orym179, String cdgm272, String sourcing_cdgm272, String cdgm344, String sourcing_cdgm344,
			String orym354, String sourcing_orym354, String cdgm349, String sourcing_cdgm349, String cdgm348,
			String sourcing_cdgm348, String orym700) {
		super();
		this.op = op;
		this.totboh = totboh;
		this.autres = autres;
		this.qty = qty;
		this.part_oem = part_oem;
		this.cc = cc;
		this.noun = noun;
		this.tl = tl;
		this.ata = ata;
		this.gest = gest;
		this.pef = pef;
		this.ownr = ownr;
		this.jic_id = jic_id;
		this.cdgm380 = cdgm380;
		this.sourcing_cdgm380 = sourcing_cdgm380;
		this.cdgm145 = cdgm145;
		this.sourcing_cdgm145 = sourcing_cdgm145;
		this.orym900 = orym900;
		this.sourcing_orym900 = sourcing_orym900;
		this.cdgm247 = cdgm247;
		this.sourcing_cdgm247 = sourcing_cdgm247;
		this.cdgm161 = cdgm161;
		this.sourcing_cdgm161 = sourcing_cdgm161;
		this.cdgm090 = cdgm090;
		this.sourcing_cdgm090 = sourcing_cdgm090;
		this.tlsm031 = tlsm031;
		this.sourcing_tlsm031 = sourcing_tlsm031;
		this.xybm902 = xybm902;
		this.sourcing_xybm902 = sourcing_xybm902;
		this.vlrm800 = vlrm800;
		this.sourcing_vlrm800 = sourcing_vlrm800;
		this.cdgm500 = cdgm500;
		this.sourcing_cdgm500 = sourcing_cdgm500;
		this.orym179 = orym179;
		this.sourcing_orym179 = sourcing_orym179;
		this.cdgm272 = cdgm272;
		this.sourcing_cdgm272 = sourcing_cdgm272;
		this.cdgm344 = cdgm344;
		this.sourcing_cdgm344 = sourcing_cdgm344;
		this.orym354 = orym354;
		this.sourcing_orym354 = sourcing_orym354;
		this.cdgm349 = cdgm349;
		this.sourcing_cdgm349 = sourcing_cdgm349;
		this.cdgm348 = cdgm348;
		this.sourcing_cdgm348 = sourcing_cdgm348;
		this.orym700 = orym700;
	}

	public Long getId_shared_availability() {
		return id_shared_availability;
	}

	public void setId_shared_availability(Long id_shared_availability) {
		this.id_shared_availability = id_shared_availability;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getTotboh() {
		return totboh;
	}

	public void setTotboh(String totboh) {
		this.totboh = totboh;
	}

	public String getAutres() {
		return autres;
	}

	public void setAutres(String autres) {
		this.autres = autres;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getPart_oem() {
		return part_oem;
	}

	public void setPart_oem(String part_oem) {
		this.part_oem = part_oem;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
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

	public String getJic_id() {
		return jic_id;
	}

	public void setJic_id(String jic_id) {
		this.jic_id = jic_id;
	}

	public String getCdgm380() {
		return cdgm380;
	}

	public void setCdgm380(String cdgm380) {
		this.cdgm380 = cdgm380;
	}

	public String getSourcing_cdgm380() {
		return sourcing_cdgm380;
	}

	public void setSourcing_cdgm380(String sourcing_cdgm380) {
		this.sourcing_cdgm380 = sourcing_cdgm380;
	}

	public String getCdgm145() {
		return cdgm145;
	}

	public void setCdgm145(String cdgm145) {
		this.cdgm145 = cdgm145;
	}

	public String getSourcing_cdgm145() {
		return sourcing_cdgm145;
	}

	public void setSourcing_cdgm145(String sourcing_cdgm145) {
		this.sourcing_cdgm145 = sourcing_cdgm145;
	}

	public String getOrym900() {
		return orym900;
	}

	public void setOrym900(String orym900) {
		this.orym900 = orym900;
	}

	public String getSourcing_orym900() {
		return sourcing_orym900;
	}

	public void setSourcing_orym900(String sourcing_orym900) {
		this.sourcing_orym900 = sourcing_orym900;
	}

	public String getCdgm247() {
		return cdgm247;
	}

	public void setCdgm247(String cdgm247) {
		this.cdgm247 = cdgm247;
	}

	public String getSourcing_cdgm247() {
		return sourcing_cdgm247;
	}

	public void setSourcing_cdgm247(String sourcing_cdgm247) {
		this.sourcing_cdgm247 = sourcing_cdgm247;
	}

	public String getCdgm161() {
		return cdgm161;
	}

	public void setCdgm161(String cdgm161) {
		this.cdgm161 = cdgm161;
	}

	public String getSourcing_cdgm161() {
		return sourcing_cdgm161;
	}

	public void setSourcing_cdgm161(String sourcing_cdgm161) {
		this.sourcing_cdgm161 = sourcing_cdgm161;
	}

	public String getCdgm090() {
		return cdgm090;
	}

	public void setCdgm090(String cdgm090) {
		this.cdgm090 = cdgm090;
	}

	public String getSourcing_cdgm090() {
		return sourcing_cdgm090;
	}

	public void setSourcing_cdgm090(String sourcing_cdgm090) {
		this.sourcing_cdgm090 = sourcing_cdgm090;
	}

	public String getTlsm031() {
		return tlsm031;
	}

	public void setTlsm031(String tlsm031) {
		this.tlsm031 = tlsm031;
	}

	public String getSourcing_tlsm031() {
		return sourcing_tlsm031;
	}

	public void setSourcing_tlsm031(String sourcing_tlsm031) {
		this.sourcing_tlsm031 = sourcing_tlsm031;
	}

	public String getXybm902() {
		return xybm902;
	}

	public void setXybm902(String xybm902) {
		this.xybm902 = xybm902;
	}

	public String getSourcing_xybm902() {
		return sourcing_xybm902;
	}

	public void setSourcing_xybm902(String sourcing_xybm902) {
		this.sourcing_xybm902 = sourcing_xybm902;
	}

	public String getVlrm800() {
		return vlrm800;
	}

	public void setVlrm800(String vlrm800) {
		this.vlrm800 = vlrm800;
	}

	public String getSourcing_vlrm800() {
		return sourcing_vlrm800;
	}

	public void setSourcing_vlrm800(String sourcing_vlrm800) {
		this.sourcing_vlrm800 = sourcing_vlrm800;
	}

	public String getCdgm500() {
		return cdgm500;
	}

	public void setCdgm500(String cdgm500) {
		this.cdgm500 = cdgm500;
	}

	public String getSourcing_cdgm500() {
		return sourcing_cdgm500;
	}

	public void setSourcing_cdgm500(String sourcing_cdgm500) {
		this.sourcing_cdgm500 = sourcing_cdgm500;
	}

	public String getOrym179() {
		return orym179;
	}

	public void setOrym179(String orym179) {
		this.orym179 = orym179;
	}

	public String getSourcing_orym179() {
		return sourcing_orym179;
	}

	public void setSourcing_orym179(String sourcing_orym179) {
		this.sourcing_orym179 = sourcing_orym179;
	}

	public String getCdgm272() {
		return cdgm272;
	}

	public void setCdgm272(String cdgm272) {
		this.cdgm272 = cdgm272;
	}

	public String getSourcing_cdgm272() {
		return sourcing_cdgm272;
	}

	public void setSourcing_cdgm272(String sourcing_cdgm272) {
		this.sourcing_cdgm272 = sourcing_cdgm272;
	}

	public String getCdgm344() {
		return cdgm344;
	}

	public void setCdgm344(String cdgm344) {
		this.cdgm344 = cdgm344;
	}

	public String getSourcing_cdgm344() {
		return sourcing_cdgm344;
	}

	public void setSourcing_cdgm344(String sourcing_cdgm344) {
		this.sourcing_cdgm344 = sourcing_cdgm344;
	}

	public String getOrym354() {
		return orym354;
	}

	public void setOrym354(String orym354) {
		this.orym354 = orym354;
	}

	public String getSourcing_orym354() {
		return sourcing_orym354;
	}

	public void setSourcing_orym354(String sourcing_orym354) {
		this.sourcing_orym354 = sourcing_orym354;
	}

	public String getCdgm349() {
		return cdgm349;
	}

	public void setCdgm349(String cdgm349) {
		this.cdgm349 = cdgm349;
	}

	public String getSourcing_cdgm349() {
		return sourcing_cdgm349;
	}

	public void setSourcing_cdgm349(String sourcing_cdgm349) {
		this.sourcing_cdgm349 = sourcing_cdgm349;
	}

	public String getCdgm348() {
		return cdgm348;
	}

	public void setCdgm348(String cdgm348) {
		this.cdgm348 = cdgm348;
	}

	public String getSourcing_cdgm348() {
		return sourcing_cdgm348;
	}

	public void setSourcing_cdgm348(String sourcing_cdgm348) {
		this.sourcing_cdgm348 = sourcing_cdgm348;
	}

	public String getOrym700() {
		return orym700;
	}

	public void setOrym700(String orym700) {
		this.orym700 = orym700;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	  
	
	
}
