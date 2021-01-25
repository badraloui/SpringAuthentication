package org.sid.details;

import java.util.ArrayList;
import java.util.Collection;

import org.sid.entities.Role;
import org.sid.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.*;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public class CustomUserDetails implements UserDetails  {

	
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	//Constructors
	public CustomUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<Role> roles = user.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		for (Role role : roles ) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}	
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getFirstName() {
		return user.getFirst_name();
	}
	
	public String getLastName() {
		return user.getLast_name();
	}
	
	public String getFullName() {
		String full_name = getFirstName() + " " + getLastName();
		return full_name;
	}
	
	
	
	

}
