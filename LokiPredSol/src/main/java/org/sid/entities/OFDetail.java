package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "open_fault_detail")
public class OFDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_detail;
	
	private String acf_fleet;
	private String acf_regcod_nospace;
	private String fault_severity;
	private String fault_deferralclass;
	private String fault_deferralref;
	private Long workpackage_linenb;
	private String workscope_barcode;
	private String workscope_code;
	private String workscope_status;
	private String due_date_extend;
	private String due_date;
	private String fault_foundondate;
	private String parent_event_id;
	private String parent_event;
	private String workpack_barcode;
	private String workpackage_number;
	private String workpack;
	private String workpack_schstdt;
	private String task_req_code;
	private String labor_skill;
	private float labor_hourssched;
	private float labor_hoursactual;
	private float labor_hoursadjusted;
	
	//Constructor without parameters 
	public OFDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor with parameters 
	public OFDetail(String acf_fleet, String acf_regcod_nospace, String fault_severity, String fault_deferralclass,
			String fault_deferralref, Long workpackage_linenb, String workscope_barcode, String workscope_code,
			String workscope_status, String due_date_extend, String due_date, String fault_foundondate,
			String parent_event_id, String parent_event, String workpack_barcode, String workpackage_number,
			String workpack, String workpack_schstdt, String task_req_code, String labor_skill, float labor_hourssched,
			float labor_hoursactual, float labor_hoursadjusted) {
		super();
		this.acf_fleet = acf_fleet;
		this.acf_regcod_nospace = acf_regcod_nospace;
		this.fault_severity = fault_severity;
		this.fault_deferralclass = fault_deferralclass;
		this.fault_deferralref = fault_deferralref;
		this.workpackage_linenb = workpackage_linenb;
		this.workscope_barcode = workscope_barcode;
		this.workscope_code = workscope_code;
		this.workscope_status = workscope_status;
		this.due_date_extend = due_date_extend;
		this.due_date = due_date;
		this.fault_foundondate = fault_foundondate;
		this.parent_event_id = parent_event_id;
		this.parent_event = parent_event;
		this.workpack_barcode = workpack_barcode;
		this.workpackage_number = workpackage_number;
		this.workpack = workpack;
		this.workpack_schstdt = workpack_schstdt;
		this.task_req_code = task_req_code;
		this.labor_skill = labor_skill;
		this.labor_hourssched = labor_hourssched;
		this.labor_hoursactual = labor_hoursactual;
		this.labor_hoursadjusted = labor_hoursadjusted;
	}

	
	//Getter and setters :
	
	public Long getId_detail() {
		return id_detail;
	}
	
	public void setId_detail(Long id_detail) {
		this.id_detail = id_detail;
	}

	public String getAcf_fleet() {
		return acf_fleet;
	}

	public void setAcf_fleet(String acf_fleet) {
		this.acf_fleet = acf_fleet;
	}

	public String getAcf_regcod_nospace() {
		return acf_regcod_nospace;
	}

	public void setAcf_regcod_nospace(String acf_regcod_nospace) {
		this.acf_regcod_nospace = acf_regcod_nospace;
	}

	public String getFault_severity() {
		return fault_severity;
	}

	public void setFault_severity(String fault_severity) {
		this.fault_severity = fault_severity;
	}

	public String getFault_deferralclass() {
		return fault_deferralclass;
	}

	public void setFault_deferralclass(String fault_deferralclass) {
		this.fault_deferralclass = fault_deferralclass;
	}

	public String getFault_deferralref() {
		return fault_deferralref;
	}

	public void setFault_deferralref(String fault_deferralref) {
		this.fault_deferralref = fault_deferralref;
	}

	public Long getWorkpackage_linenb() {
		return workpackage_linenb;
	}

	public void setWorkpackage_linenb(Long workpackage_linenb) {
		this.workpackage_linenb = workpackage_linenb;
	}

	public String getWorkscope_barcode() {
		return workscope_barcode;
	}

	public void setWorkscope_barcode(String workscope_barcode) {
		this.workscope_barcode = workscope_barcode;
	}

	public String getWorkscope_code() {
		return workscope_code;
	}

	public void setWorkscope_code(String workscope_code) {
		this.workscope_code = workscope_code;
	}

	public String getWorkscope_status() {
		return workscope_status;
	}

	public void setWorkscope_status(String workscope_status) {
		this.workscope_status = workscope_status;
	}

	public String getDue_date_extend() {
		return due_date_extend;
	}

	public void setDue_date_extend(String due_date_extend) {
		this.due_date_extend = due_date_extend;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public String getFault_foundondate() {
		return fault_foundondate;
	}

	public void setFault_foundondate(String fault_foundondate) {
		this.fault_foundondate = fault_foundondate;
	}

	public String getParent_event_id() {
		return parent_event_id;
	}

	public void setParent_event_id(String parent_event_id) {
		this.parent_event_id = parent_event_id;
	}

	public String getParent_event() {
		return parent_event;
	}

	public void setParent_event(String parent_event) {
		this.parent_event = parent_event;
	}

	public String getWorkpack_barcode() {
		return workpack_barcode;
	}

	public void setWorkpack_barcode(String workpack_barcode) {
		this.workpack_barcode = workpack_barcode;
	}

	public String getWorkpackage_number() {
		return workpackage_number;
	}

	public void setWorkpackage_number(String workpackage_number) {
		this.workpackage_number = workpackage_number;
	}

	public String getWorkpack() {
		return workpack;
	}

	public void setWorkpack(String workpack) {
		this.workpack = workpack;
	}

	public String getWorkpack_schstdt() {
		return workpack_schstdt;
	}

	public void setWorkpack_schstdt(String workpack_schstdt) {
		this.workpack_schstdt = workpack_schstdt;
	}

	public String getTask_req_code() {
		return task_req_code;
	}

	public void setTask_req_code(String task_req_code) {
		this.task_req_code = task_req_code;
	}

	public String getLabor_skill() {
		return labor_skill;
	}

	public void setLabor_skill(String labor_skill) {
		this.labor_skill = labor_skill;
	}

	public float getLabor_hourssched() {
		return labor_hourssched;
	}

	public void setLabor_hourssched(float labor_hourssched) {
		this.labor_hourssched = labor_hourssched;
	}

	public float getLabor_hoursactual() {
		return labor_hoursactual;
	}

	public void setLabor_hoursactual(float labor_hoursactual) {
		this.labor_hoursactual = labor_hoursactual;
	}

	public float getLabor_hoursadjusted() {
		return labor_hoursadjusted;
	}

	public void setLabor_hoursadjusted(float labor_hoursadjusted) {
		this.labor_hoursadjusted = labor_hoursadjusted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
