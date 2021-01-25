package org.sid.metier;

import org.sid.entities.User;

public interface IUserMetier {
	   
	public User findByEmail(String email);

}
