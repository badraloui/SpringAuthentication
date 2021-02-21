package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "open_task_detail")
public class OTDetail implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY,  generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_ot_detail;
	
	private String fleet;  
	private String ac;
	private String op; 
	private String task_barecode;
	private String task_req_code;
	private String jic_id;
	private String jic_code;
	private String jic_title;
	private String task_req_due_date;
	private String sched_start_date;
	private String type_2; 
	private String subtype;
	private String priority;
	private String task_req_name;
	private String task_req_inventory;
	private String status;
	private String due_ext;
	private String due;
	private String days;
	private String days_ext;
	private String found_date;
	private String parent_event_id;
	private String parent_event;
	private String wp_id;
	private String wp_n;
	private String wp;
	private String wp_schstdt;
	private String fleet_ac;
	
	public OTDetail() {
		super();
	}
	
	public OTDetail(String fleet, String ac, String op, String task_barecode, String task_req_code, String jic_id,
			String jic_code, String jic_title, String task_req_due_date, String sched_start_date, String type_2,
			String subtype, String priority, String task_req_name, String task_req_inventory, String status,
			String due_ext, String due, String days, String days_ext, String found_date, String parent_event_id,
			String parent_event, String wp_id, String wp_n, String wp, String wp_schstdt, String fleet_ac) {
		super();
		this.fleet = fleet;
		this.ac = ac;
		this.op = op;
		this.task_barecode = task_barecode;
		this.task_req_code = task_req_code;
		this.jic_id = jic_id;
		this.jic_code = jic_code;
		this.jic_title = jic_title;
		this.task_req_due_date = task_req_due_date;
		this.sched_start_date = sched_start_date;
		this.type_2 = type_2;
		this.subtype = subtype;
		this.priority = priority;
		this.task_req_name = task_req_name;
		this.task_req_inventory = task_req_inventory;
		this.status = status;
		this.due_ext = due_ext;
		this.due = due;
		this.days = days;
		this.days_ext = days_ext;
		this.found_date = found_date;
		this.parent_event_id = parent_event_id;
		this.parent_event = parent_event;
		this.wp_id = wp_id;
		this.wp_n = wp_n;
		this.wp = wp;
		this.wp_schstdt = wp_schstdt;
		this.fleet_ac = fleet_ac;
	}
	public Long getId_ot_detail() {
		return id_ot_detail;
	}
	public void setId_ot_detail(Long id_ot_detail) {
		this.id_ot_detail = id_ot_detail;
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
	public String getType_2() {
		return type_2;
	}
	public void setType_2(String type_2) {
		this.type_2 = type_2;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
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
	public String getDue_ext() {
		return due_ext;
	}
	public void setDue_ext(String due_ext) {
		this.due_ext = due_ext;
	}
	public String getDue() {
		return due;
	}
	public void setDue(String due) {
		this.due = due;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getDays_ext() {
		return days_ext;
	}
	public void setDays_ext(String days_ext) {
		this.days_ext = days_ext;
	}
	public String getFound_date() {
		return found_date;
	}
	public void setFound_date(String found_date) {
		this.found_date = found_date;
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
	public String getWp_id() {
		return wp_id;
	}
	public void setWp_id(String wp_id) {
		this.wp_id = wp_id;
	}
	public String getWp_n() {
		return wp_n;
	}
	public void setWp_n(String wp_n) {
		this.wp_n = wp_n;
	}
	public String getWp() {
		return wp;
	}
	public void setWp(String wp) {
		this.wp = wp;
	}
	public String getWp_schstdt() {
		return wp_schstdt;
	}
	public void setWp_schstdt(String wp_schstdt) {
		this.wp_schstdt = wp_schstdt;
	}
	public String getFleet_ac() {
		return fleet_ac;
	}
	public void setFleet_ac(String fleet_ac) {
		this.fleet_ac = fleet_ac;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
