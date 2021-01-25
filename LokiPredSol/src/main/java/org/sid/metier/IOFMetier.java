package org.sid.metier;

import java.util.List;

import org.sid.entities.OFAvailability;
import org.sid.entities.OFDetail;
import org.sid.entities.OFRequest;

public interface IOFMetier {
	
	public List<OFDetail> consultOFDetail();
	public List<OFAvailability> consultOFAvailability();
	public List<OFRequest> consultOFRequest();
	
}
