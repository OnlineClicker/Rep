package de.awk.dao;

import de.awk.model.Dozent;

public class DozentDAO extends GenericDAO {
	
	public DozentDAO() {
		super(Dozent.class);
	}
	
    public void delete(Dozent dozent) {
        super.delete(dozent.getDozentID(), Dozent.class);
    }
}
