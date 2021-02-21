package org.sid.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "users") 
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String first_name ;
	private String last_name ;
	
	@Id
	private String email;
	private String password;
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            	joinColumns = { @JoinColumn(name = "user_email", referencedColumnName = "email")},
            	inverseJoinColumns = {@JoinColumn(name = "user_role", referencedColumnName = "name") })
    private Collection<Role> roles ;

	
	//Constructor without parameter
	public User() {
		super();
	}
	
	//Constructor with parameter
	public User(String first_name, String last_name, String email, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		
	}
	public User(String first_name, String last_name, String email, String password, Collection<Role> roles) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	//Getters and setters

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
