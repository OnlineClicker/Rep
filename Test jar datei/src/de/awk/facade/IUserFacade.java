package de.awk.facade;

import de.awk.model.User;

public interface IUserFacade {
	/*
	 * Suche eines Users mit gleichen Namen
	 */
	public User findUserByName(String name);
}
