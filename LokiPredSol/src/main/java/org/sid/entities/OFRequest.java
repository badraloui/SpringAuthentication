package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "open_fault_request")
public class OFRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_request;
	
	private Long workpackage_linenb;
	private String part_note;
	private String mand_if;
	private String part_request_external_ref;
	private String part_grp_name;
	private String workscope_barcode;
	private int material_qty;
	private String part_oem;
	private String part_grp_cod;
	private String part_baseline;
	private String part_pos;
	private String part_grp_assmbl;
	private String part_grp_inv_class;
	private String ccn;
	private String noun;
	private String tl;
	private String part_request_request_id;
	
	//Constructor without parameters 
	public OFRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor with parameters 
	public OFRequest(Long workpackage_linenb, String part_note, String mand_if, String part_request_external_ref,
			String part_grp_name, String workscope_barcode, int material_qty, String part_oem, String part_grp_cod,
			String part_baseline, String part_pos, String part_grp_assmbl, String part_grp_inv_class, String ccn,
			String noun, String tl, String part_request_request_id) {
		super();
		this.workpackage_linenb = workpackage_linenb;
		this.part_note = part_note;
		this.mand_if = mand_if;
		this.part_request_external_ref = part_request_external_ref;
		this.part_grp_name = part_grp_name;
		this.workscope_barcode = workscope_barcode;
		this.material_qty = material_qty;
		this.part_oem = part_oem;
		this.part_grp_cod = part_grp_cod;
		this.part_baseline = part_baseline;
		this.part_pos = part_pos;
		this.part_grp_assmbl = part_grp_assmbl;
		this.part_grp_inv_class = part_grp_inv_class;
		this.ccn = ccn;
		this.noun = noun;
		this.tl = tl;
		this.part_request_request_id = part_request_request_id;
	}
	
	//Getters and setters :
	
	public Long getId_request() {
		return id_request;
	}

	public void setId_request(Long id_request) {
		this.id_request = id_request;
	}

	public Long getWorkpackage_linenb() {
		return workpackage_linenb;
	}

	public void setWorkpackage_linenb(Long workpackage_linenb) {
		this.workpackage_linenb = workpackage_linenb;
	}

	public String getPart_note() {
		return part_note;
	}

	public void setPart_note(String part_note) {
		this.part_note = part_note;
	}

	public String getMand_if() {
		return mand_if;
	}

	public void setMand_if(String mand_if) {
		this.mand_if = mand_if;
	}

	public String getPart_request_external_ref() {
		return part_request_external_ref;
	}

	public void setPart_request_external_ref(String part_request_external_ref) {
		this.part_request_external_ref = part_request_external_ref;
	}

	public String getPart_grp_name() {
		return part_grp_name;
	}

	public void setPart_grp_name(String part_grp_name) {
		this.part_grp_name = part_grp_name;
	}

	public String getWorkscope_barcode() {
		return workscope_barcode;
	}

	public void setWorkscope_barcode(String workscope_barcode) {
		this.workscope_barcode = workscope_barcode;
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

	public String getPart_grp_cod() {
		return part_grp_cod;
	}

	public void setPart_grp_cod(String part_grp_cod) {
		this.part_grp_cod = part_grp_cod;
	}

	public String getPart_baseline() {
		return part_baseline;
	}

	public void setPart_baseline(String part_baseline) {
		this.part_baseline = part_baseline;
	}

	public String getPart_pos() {
		return part_pos;
	}

	public void setPart_pos(String part_pos) {
		this.part_pos = part_pos;
	}

	public String getPart_grp_assmbl() {
		return part_grp_assmbl;
	}

	public void setPart_grp_assmbl(String part_grp_assmbl) {
		this.part_grp_assmbl = part_grp_assmbl;
	}

	public String getPart_grp_inv_class() {
		return part_grp_inv_class;
	}

	public void setPart_grp_inv_class(String part_grp_inv_class) {
		this.part_grp_inv_class = part_grp_inv_class;
	}

	public String getCcn() {
		return ccn;
	}

	public void setCcn(String ccn) {
		this.ccn = ccn;
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

	public String getPart_request_request_id() {
		return part_request_request_id;
	}

	public void setPart_request_request_id(String part_request_request_id) {
		this.part_request_request_id = part_request_request_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
