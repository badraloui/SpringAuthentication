package org.sid.web;


import java.util.List;

import org.sid.entities.OFAvailability;
import org.sid.entities.OFDetail;
import org.sid.entities.OFRequest;
import org.sid.metier.OFMetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping(value = "/")
public class DashboardContoller {

	@Autowired
	private OFMetierImpl OFMetierImpl;
	
	
	@RequestMapping(value = "/")
	public String viewFaultsPage(Model model, String keyword) {
		
	    List<OFDetail> faultDetails = OFMetierImpl.consultOFDetail();
	    if (keyword != null) {
	    model.addAttribute("faultDetails", OFMetierImpl.findByKeyword(keyword));
	    }
	    else {
		    model.addAttribute("faultDetails", faultDetails);
	    }

	    List<OFAvailability> faultAvailability = OFMetierImpl.consultOFAvailability();
	    model.addAttribute("faultAvailability", faultAvailability);
	    List<OFRequest> faultRequest = OFMetierImpl.consultOFRequest();
	    model.addAttribute("faultRequest", faultRequest);
	    return "index";
	
	}
	
	@RequestMapping("/faultsFiltered")
	public String getFaultDetailsFiltered(Model model, String keyword) {
		
	    List<OFDetail> faultDetails = OFMetierImpl.consultOFDetail();
	    model.addAttribute("faultDetails", faultDetails);
	    return "faultDetailsFiltered";
	
	}
	
	
	@RequestMapping(value="charts", method= RequestMethod.GET, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
	public ResponseEntity<Iterable<OFDetail>> findAll(){
		try {
			return new ResponseEntity<Iterable<OFDetail>>(OFMetierImpl.consultOFDetail(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Iterable<OFDetail>>(HttpStatus.BAD_REQUEST);
			}	
		}
	
	@RequestMapping(value="charts", method = RequestMethod.GET)
		public String index() {
			return "charts";
		}		
	

}


