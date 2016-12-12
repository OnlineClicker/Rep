package de.awk.dao;

import de.awk.model.Dozent;
import de.awk.model.Frage;

public class FrageDAO extends GenericDAO {
	
	public FrageDAO() {
		super(Frage.class);
	}
	
    public void delete(Frage frage) {
        super.delete(frage.getFrageID(), Frage.class);
    }
}
