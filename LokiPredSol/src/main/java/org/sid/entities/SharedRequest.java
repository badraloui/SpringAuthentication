package org.sid.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "shared_wp_ot_request")
public class SharedRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_shared_request ;
	
	private String op;
	private String sts;
	private String part_note;
	private String mand_if;
	private String prolog;
	private String qty;
	private String part_oem;
	private String jid_id;
	private String jid_code;
	private String part_grp_cod;
	private String part_grp_name; //VARCHAR(100)
	private String part_pos;
	private String baseline;
	private String assmbly;
	private String inv_class;
	private String lru;
	private String part_request_external_ref;
	private String fits;
	private String primempn;
	private String fits_spec_1;
	private String fits_spec_2;
	private String fits_spec_3;
	private String fits_spec_4;
	private String fits_spec_5;
	
	public SharedRequest() {
		super();
	}

	public SharedRequest(Long id_shared_request, String op, String sts, String part_note, String mand_if, String prolog,
			String qty, String part_oem, String jid_id, String jid_code, String part_grp_cod, String part_grp_name,
			String part_pos, String baseline, String assmbly, String inv_class, String lru,
			String part_request_external_ref, String fits, String primempn, String fits_spec_1, String fits_spec_2,
			String fits_spec_3, String fits_spec_4, String fits_spec_5) {
		super();
		this.id_shared_request = id_shared_request;
		this.op = op;
		this.sts = sts;
		this.part_note = part_note;
		this.mand_if = mand_if;
		this.prolog = prolog;
		this.qty = qty;
		this.part_oem = part_oem;
		this.jid_id = jid_id;
		this.jid_code = jid_code;
		this.part_grp_cod = part_grp_cod;
		this.part_grp_name = part_grp_name;
		this.part_pos = part_pos;
		this.baseline = baseline;
		this.assmbly = assmbly;
		this.inv_class = inv_class;
		this.lru = lru;
		this.part_request_external_ref = part_request_external_ref;
		this.fits = fits;
		this.primempn = primempn;
		this.fits_spec_1 = fits_spec_1;
		this.fits_spec_2 = fits_spec_2;
		this.fits_spec_3 = fits_spec_3;
		this.fits_spec_4 = fits_spec_4;
		this.fits_spec_5 = fits_spec_5;
	}

	public Long getId_shared_request() {
		return id_shared_request;
	}

	public void setId_shared_request(Long id_shared_request) {
		this.id_shared_request = id_shared_request;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
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

	public String getProlog() {
		return prolog;
	}

	public void setProlog(String prolog) {
		this.prolog = prolog;
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

	public String getJid_id() {
		return jid_id;
	}

	public void setJid_id(String jid_id) {
		this.jid_id = jid_id;
	}

	public String getJid_code() {
		return jid_code;
	}

	public void setJid_code(String jid_code) {
		this.jid_code = jid_code;
	}

	public String getPart_grp_cod() {
		return part_grp_cod;
	}

	public void setPart_grp_cod(String part_grp_cod) {
		this.part_grp_cod = part_grp_cod;
	}

	public String getPart_grp_name() {
		return part_grp_name;
	}

	public void setPart_grp_name(String part_grp_name) {
		this.part_grp_name = part_grp_name;
	}

	public String getPart_pos() {
		return part_pos;
	}

	public void setPart_pos(String part_pos) {
		this.part_pos = part_pos;
	}

	public String getBaseline() {
		return baseline;
	}

	public void setBaseline(String baseline) {
		this.baseline = baseline;
	}

	public String getAssmbly() {
		return assmbly;
	}

	public void setAssmbly(String assmbly) {
		this.assmbly = assmbly;
	}

	public String getInv_class() {
		return inv_class;
	}

	public void setInv_class(String inv_class) {
		this.inv_class = inv_class;
	}

	public String getLru() {
		return lru;
	}

	public void setLru(String lru) {
		this.lru = lru;
	}

	public String getPart_request_external_ref() {
		return part_request_external_ref;
	}

	public void setPart_request_external_ref(String part_request_external_ref) {
		this.part_request_external_ref = part_request_external_ref;
	}

	public String getFits() {
		return fits;
	}

	public void setFits(String fits) {
		this.fits = fits;
	}

	public String getPrimempn() {
		return primempn;
	}

	public void setPrimempn(String primempn) {
		this.primempn = primempn;
	}

	public String getFits_spec_1() {
		return fits_spec_1;
	}

	public void setFits_spec_1(String fits_spec_1) {
		this.fits_spec_1 = fits_spec_1;
	}

	public String getFits_spec_2() {
		return fits_spec_2;
	}

	public void setFits_spec_2(String fits_spec_2) {
		this.fits_spec_2 = fits_spec_2;
	}

	public String getFits_spec_3() {
		return fits_spec_3;
	}

	public void setFits_spec_3(String fits_spec_3) {
		this.fits_spec_3 = fits_spec_3;
	}

	public String getFits_spec_4() {
		return fits_spec_4;
	}

	public void setFits_spec_4(String fits_spec_4) {
		this.fits_spec_4 = fits_spec_4;
	}

	public String getFits_spec_5() {
		return fits_spec_5;
	}

	public void setFits_spec_5(String fits_spec_5) {
		this.fits_spec_5 = fits_spec_5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
