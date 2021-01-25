package org.sid.metier;


import java.util.List;

import org.sid.dao.OFAvailabilityRepository;
import org.sid.dao.OFDetailRepository;
import org.sid.dao.OFRequestRepository;
import org.sid.entities.OFAvailability;
import org.sid.entities.OFDetail;
import org.sid.entities.OFRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OFMetierImpl implements IOFMetier {
	
	
	@Autowired
	OFAvailabilityRepository faultAvailabilityRepository;
	
	@Autowired
	OFDetailRepository faultDetailsRepository;
	
	@Autowired
	OFRequestRepository faultRequestRepository;
	
	
	@Override
	public List<OFDetail> consultOFDetail() {
		return faultDetailsRepository.findAll();
	}

	@Override
	public List<OFAvailability> consultOFAvailability() {
		return faultAvailabilityRepository.findAll();
	}

	@Override
	public List<OFRequest> consultOFRequest() {
		return faultRequestRepository.findAll();
	}
	
	public List<OFDetail> findByKeyword(String keyword){
			return faultDetailsRepository.findByKeyword(keyword);
	}


	
}
