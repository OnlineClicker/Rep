package de.awk.facade.impl;

import javax.ejb.EJB;

import de.awk.dao.UserDAO;
import de.awk.facade.IUserFacade;
import de.awk.model.User;

public class UserFacadeImpl implements IUserFacade {
		
	@EJB 
	private UserDAO userDAO;
	
	public User findUserByName(String name) {
		return userDAO.findUserByUsername(name);
	}
}
