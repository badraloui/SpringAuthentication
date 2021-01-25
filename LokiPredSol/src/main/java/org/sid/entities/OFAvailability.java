package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "open_fault_availability")
public class OFAvailability implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_availability;
	
	private Long workpackage_linenb;	
	private String stock;
	private String autres;
	private int material_qty;
	private String part_oem;
	private String ccn;
	private String tl;
	private String noun;
	private String ata;
	private String gestgsa;
	private String pef;
	private String owner;
	private String workscope_barcode;
	private int orym900;
	private String sourcing_orym900;
	private int vlrm800;
	private String sourcing_vlrm800;
	private int tlsm031;
	private String sourcing_tlsm031;
	private int cdgm145;
	private String sourcing_cdgm145;
	private int cdgm161;
	private String sourcing_cdgm161;
	private int cdgm500;
	private String sourcing_cdgm500;
	private int orym179;
	private String sourcing_orym179;
	private int cdgm272;
	private String sourcing_cdgm272;
	private int cdgm090;
	private String sourcing_cdgm090;
	private int cdgm344;
	private String sourcing_cdgm344;
	private int orym354;
	private String sourcing_orym354;
	private int xybm902;
	private String sourcing_xybm902;
	private int cdgm380;
	private String sourcing_cdgm380;
	private int cdgm349;
	private String sourcing_cdgm349;
	private int cdgm348;
	private String sourcing_cdgm348;
	private int orym700;
	private String sourcing_orym700;
	private int cdgm247;
	private String sourcing_cdgm247;
	
	//Constructor without parameters 
	public OFAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor with parameters 
	public OFAvailability(Long workpackage_linenb, String stock, String autres, int material_qty, String part_oem,
			String ccn, String tl, String noun, String ata, String gestgsa, String pef, String owner,
			String workscope_barcode, int orym900, String sourcing_orym900, int vlrm800, String sourcing_vlrm800,
			int tlsm031, String sourcing_tlsm031, int cdgm145, String sourcing_cdgm145, int cdgm161,
			String sourcing_cdgm161, int cdgm500, String sourcing_cdgm500, int orym179, String sourcing_orym179,
			int cdgm272, String sourcing_cdgm272, int cdgm090, String sourcing_cdgm090, int cdgm344,
			String sourcing_cdgm344, int orym354, String sourcing_orym354, int xybm902, String sourcing_xybm902,
			int cdgm380, String sourcing_cdgm380, int cdgm349, String sourcing_cdgm349, int cdgm348,
			String sourcing_cdgm348, int orym700, String sourcing_orym700, int cdgm247, String sourcing_cdgm247) {
		super();
		this.workpackage_linenb = workpackage_linenb;
		this.stock = stock;
		this.autres = autres;
		this.material_qty = material_qty;
		this.part_oem = part_oem;
		this.ccn = ccn;
		this.tl = tl;
		this.noun = noun;
		this.ata = ata;
		this.gestgsa = gestgsa;
		this.pef = pef;
		this.owner = owner;
		this.workscope_barcode = workscope_barcode;
		this.orym900 = orym900;
		this.sourcing_orym900 = sourcing_orym900;
		this.vlrm800 = vlrm800;
		this.sourcing_vlrm800 = sourcing_vlrm800;
		this.tlsm031 = tlsm031;
		this.sourcing_tlsm031 = sourcing_tlsm031;
		this.cdgm145 = cdgm145;
		this.sourcing_cdgm145 = sourcing_cdgm145;
		this.cdgm161 = cdgm161;
		this.sourcing_cdgm161 = sourcing_cdgm161;
		this.cdgm500 = cdgm500;
		this.sourcing_cdgm500 = sourcing_cdgm500;
		this.orym179 = orym179;
		this.sourcing_orym179 = sourcing_orym179;
		this.cdgm272 = cdgm272;
		this.sourcing_cdgm272 = sourcing_cdgm272;
		this.cdgm090 = cdgm090;
		this.sourcing_cdgm090 = sourcing_cdgm090;
		this.cdgm344 = cdgm344;
		this.sourcing_cdgm344 = sourcing_cdgm344;
		this.orym354 = orym354;
		this.sourcing_orym354 = sourcing_orym354;
		this.xybm902 = xybm902;
		this.sourcing_xybm902 = sourcing_xybm902;
		this.cdgm380 = cdgm380;
		this.sourcing_cdgm380 = sourcing_cdgm380;
		this.cdgm349 = cdgm349;
		this.sourcing_cdgm349 = sourcing_cdgm349;
		this.cdgm348 = cdgm348;
		this.sourcing_cdgm348 = sourcing_cdgm348;
		this.orym700 = orym700;
		this.sourcing_orym700 = sourcing_orym700;
		this.cdgm247 = cdgm247;
		this.sourcing_cdgm247 = sourcing_cdgm247;
	}
	
	//Getters and setters :
	
	public Long getId_availability() {
		return id_availability;
	}

	public void setId_availability(Long id_availability) {
		this.id_availability = id_availability;
	}

	public Long getWorkpackage_linenb() {
		return workpackage_linenb;
	}

	public void setWorkpackage_linenb(Long workpackage_linenb) {
		this.workpackage_linenb = workpackage_linenb;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getAutres() {
		return autres;
	}

	public void setAutres(String autres) {
		this.autres = autres;
	}

	public int getMaterial_qty() {
		return material_qty;
	}

	public void setMaterial_qty(int material_qty) {
		this.material_qty = material_qty;
	}

	public String getPart_oem() {
		return part_oem;
	}

	public void setPart_oem(String part_oem) {
		this.part_oem = part_oem;
	}

	public String getCcn() {
		return ccn;
	}

	public void setCcn(String ccn) {
		this.ccn = ccn;
	}

	public String getTl() {
		return tl;
	}

	public void setTl(String tl) {
		this.tl = tl;
	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getAta() {
		return ata;
	}

	public void setAta(String ata) {
		this.ata = ata;
	}

	public String getGestgsa() {
		return gestgsa;
	}

	public void setGestgsa(String gestgsa) {
		this.gestgsa = gestgsa;
	}

	public String getPef() {
		return pef;
	}

	public void setPef(String pef) {
		this.pef = pef;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getWorkscope_barcode() {
		return workscope_barcode;
	}

	public void setWorkscope_barcode(String workscope_barcode) {
		this.workscope_barcode = workscope_barcode;
	}

	public int getOrym900() {
		return orym900;
	}

	public void setOrym900(int orym900) {
		this.orym900 = orym900;
	}

	public String getSourcing_orym900() {
		return sourcing_orym900;
	}

	public void setSourcing_orym900(String sourcing_orym900) {
		this.sourcing_orym900 = sourcing_orym900;
	}

	public int getVlrm800() {
		return vlrm800;
	}

	public void setVlrm800(int vlrm800) {
		this.vlrm800 = vlrm800;
	}

	public String getSourcing_vlrm800() {
		return sourcing_vlrm800;
	}

	public void setSourcing_vlrm800(String sourcing_vlrm800) {
		this.sourcing_vlrm800 = sourcing_vlrm800;
	}

	public int getTlsm031() {
		return tlsm031;
	}

	public void setTlsm031(int tlsm031) {
		this.tlsm031 = tlsm031;
	}

	public String getSourcing_tlsm031() {
		return sourcing_tlsm031;
	}

	public void setSourcing_tlsm031(String sourcing_tlsm031) {
		this.sourcing_tlsm031 = sourcing_tlsm031;
	}

	public int getCdgm145() {
		return cdgm145;
	}

	public void setCdgm145(int cdgm145) {
		this.cdgm145 = cdgm145;
	}

	public String getSourcing_cdgm145() {
		return sourcing_cdgm145;
	}

	public void setSourcing_cdgm145(String sourcing_cdgm145) {
		this.sourcing_cdgm145 = sourcing_cdgm145;
	}

	public int getCdgm161() {
		return cdgm161;
	}

	public void setCdgm161(int cdgm161) {
		this.cdgm161 = cdgm161;
	}

	public String getSourcing_cdgm161() {
		return sourcing_cdgm161;
	}

	public void setSourcing_cdgm161(String sourcing_cdgm161) {
		this.sourcing_cdgm161 = sourcing_cdgm161;
	}

	public int getCdgm500() {
		return cdgm500;
	}

	public void setCdgm500(int cdgm500) {
		this.cdgm500 = cdgm500;
	}

	public String getSourcing_cdgm500() {
		return sourcing_cdgm500;
	}

	public void setSourcing_cdgm500(String sourcing_cdgm500) {
		this.sourcing_cdgm500 = sourcing_cdgm500;
	}

	public int getOrym179() {
		return orym179;
	}

	public void setOrym179(int orym179) {
		this.orym179 = orym179;
	}

	public String getSourcing_orym179() {
		return sourcing_orym179;
	}

	public void setSourcing_orym179(String sourcing_orym179) {
		this.sourcing_orym179 = sourcing_orym179;
	}

	public int getCdgm272() {
		return cdgm272;
	}

	public void setCdgm272(int cdgm272) {
		this.cdgm272 = cdgm272;
	}

	public String getSourcing_cdgm272() {
		return sourcing_cdgm272;
	}

	public void setSourcing_cdgm272(String sourcing_cdgm272) {
		this.sourcing_cdgm272 = sourcing_cdgm272;
	}

	public int getCdgm090() {
		return cdgm090;
	}

	public void setCdgm090(int cdgm090) {
		this.cdgm090 = cdgm090;
	}

	public String getSourcing_cdgm090() {
		return sourcing_cdgm090;
	}

	public void setSourcing_cdgm090(String sourcing_cdgm090) {
		this.sourcing_cdgm090 = sourcing_cdgm090;
	}

	public int getCdgm344() {
		return cdgm344;
	}

	public void setCdgm344(int cdgm344) {
		this.cdgm344 = cdgm344;
	}

	public String getSourcing_cdgm344() {
		return sourcing_cdgm344;
	}

	public void setSourcing_cdgm344(String sourcing_cdgm344) {
		this.sourcing_cdgm344 = sourcing_cdgm344;
	}

	public int getOrym354() {
		return orym354;
	}

	public void setOrym354(int orym354) {
		this.orym354 = orym354;
	}

	public String getSourcing_orym354() {
		return sourcing_orym354;
	}

	public void setSourcing_orym354(String sourcing_orym354) {
		this.sourcing_orym354 = sourcing_orym354;
	}

	public int getXybm902() {
		return xybm902;
	}

	public void setXybm902(int xybm902) {
		this.xybm902 = xybm902;
	}

	public String getSourcing_xybm902() {
		return sourcing_xybm902;
	}

	public void setSourcing_xybm902(String sourcing_xybm902) {
		this.sourcing_xybm902 = sourcing_xybm902;
	}

	public int getCdgm380() {
		return cdgm380;
	}

	public void setCdgm380(int cdgm380) {
		this.cdgm380 = cdgm380;
	}

	public String getSourcing_cdgm380() {
		return sourcing_cdgm380;
	}

	public void setSourcing_cdgm380(String sourcing_cdgm380) {
		this.sourcing_cdgm380 = sourcing_cdgm380;
	}

	public int getCdgm349() {
		return cdgm349;
	}

	public void setCdgm349(int cdgm349) {
		this.cdgm349 = cdgm349;
	}

	public String getSourcing_cdgm349() {
		return sourcing_cdgm349;
	}

	public void setSourcing_cdgm349(String sourcing_cdgm349) {
		this.sourcing_cdgm349 = sourcing_cdgm349;
	}

	public int getCdgm348() {
		return cdgm348;
	}

	public void setCdgm348(int cdgm348) {
		this.cdgm348 = cdgm348;
	}

	public String getSourcing_cdgm348() {
		return sourcing_cdgm348;
	}

	public void setSourcing_cdgm348(String sourcing_cdgm348) {
		this.sourcing_cdgm348 = sourcing_cdgm348;
	}

	public int getOrym700() {
		return orym700;
	}

	public void setOrym700(int orym700) {
		this.orym700 = orym700;
	}

	public String getSourcing_orym700() {
		return sourcing_orym700;
	}

	public void setSourcing_orym700(String sourcing_orym700) {
		this.sourcing_orym700 = sourcing_orym700;
	}

	public int getCdgm247() {
		return cdgm247;
	}

	public void setCdgm247(int cdgm247) {
		this.cdgm247 = cdgm247;
	}

	public String getSourcing_cdgm247() {
		return sourcing_cdgm247;
	}

	public void setSourcing_cdgm247(String sourcing_cdgm247) {
		this.sourcing_cdgm247 = sourcing_cdgm247;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
