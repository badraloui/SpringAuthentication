package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "work_package_detail")
public class WPDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_wp_detail ;
	
	private String op ;
	private String task_barecode ;
	private String task_req_code ;
	private String priority;
	private String severity;
	private String type_2 ;
	private String jic_id ;
	private String jic_code;
	private String jic_title ;
	private String task_req_name ;
	private String task_req_inventory ;
	private String status ;
	private String fault_deferralclass;
	private String fault_deferralref ;
	private String task_worktype ;
	private String subtype ;
	private String task_req_due_date ;
	private String sched_start_date;
	private String parent_event ;
	private String due ;
	private String due_ext;

	public WPDetail() {
		super();
	}

	public WPDetail(String op, String task_barecode, String task_req_code, String priority, String severity,
			String type_2, String jic_id, String jic_code, String jic_title, String task_req_name,
			String task_req_inventory, String status, String fault_deferralclass, String fault_deferralref,
			String task_worktype, String subtype, String task_req_due_date, String sched_start_date,
			String parent_event, String due, String due_ext) {
		super();
		this.op = op;
		this.task_barecode = task_barecode;
		this.task_req_code = task_req_code;
		this.priority = priority;
		this.severity = severity;
		this.type_2 = type_2;
		this.jic_id = jic_id;
		this.jic_code = jic_code;
		this.jic_title = jic_title;
		this.task_req_name = task_req_name;
		this.task_req_inventory = task_req_inventory;
		this.status = status;
		this.fault_deferralclass = fault_deferralclass;
		this.fault_deferralref = fault_deferralref;
		this.task_worktype = task_worktype;
		this.subtype = subtype;
		this.task_req_due_date = task_req_due_date;
		this.sched_start_date = sched_start_date;
		this.parent_event = parent_event;
		this.due = due;
		this.due_ext = due_ext;
	}

	public Long getId_wp_detail() {
		return id_wp_detail;
	}

	public void setId_wp_detail(Long id_wp_detail) {
		this.id_wp_detail = id_wp_detail;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getTask_barecode() {
		return task_barecode;
	}

	public void setTask_barecode(String task_barecode) {
		this.task_barecode = task_barecode;
	}

	public String getTask_req_code() {
		return task_req_code;
	}

	public void setTask_req_code(String task_req_code) {
		this.task_req_code = task_req_code;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getType_2() {
		return type_2;
	}

	public void setType_2(String type_2) {
		this.type_2 = type_2;
	}

	public String getJic_id() {
		return jic_id;
	}

	public void setJic_id(String jic_id) {
		this.jic_id = jic_id;
	}

	public String getJic_code() {
		return jic_code;
	}

	public void setJic_code(String jic_code) {
		this.jic_code = jic_code;
	}

	public String getJic_title() {
		return jic_title;
	}

	public void setJic_title(String jic_title) {
		this.jic_title = jic_title;
	}

	public String getTask_req_name() {
		return task_req_name;
	}

	public void setTask_req_name(String task_req_name) {
		this.task_req_name = task_req_name;
	}

	public String getTask_req_inventory() {
		return task_req_inventory;
	}

	public void setTask_req_inventory(String task_req_inventory) {
		this.task_req_inventory = task_req_inventory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getTask_worktype() {
		return task_worktype;
	}

	public void setTask_worktype(String task_worktype) {
		this.task_worktype = task_worktype;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getTask_req_due_date() {
		return task_req_due_date;
	}

	public void setTask_req_due_date(String task_req_due_date) {
		this.task_req_due_date = task_req_due_date;
	}

	public String getSched_start_date() {
		return sched_start_date;
	}

	public void setSched_start_date(String sched_start_date) {
		this.sched_start_date = sched_start_date;
	}

	public String getParent_event() {
		return parent_event;
	}

	public void setParent_event(String parent_event) {
		this.parent_event = parent_event;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getDue_ext() {
		return due_ext;
	}

	public void setDue_ext(String due_ext) {
		this.due_ext = due_ext;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	



}
