package de.awk.dao;

import de.awk.model.ClickerEvent;

public class ClickerEventDAO extends GenericDAO {
	
	public ClickerEventDAO() {
		super(ClickerEvent.class);
	}
	
    public void delete(ClickerEvent clickerEvent) {
        super.delete(clickerEvent.getClickerID(), ClickerEvent.class);
    }
}
