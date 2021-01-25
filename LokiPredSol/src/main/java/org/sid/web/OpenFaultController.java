package org.sid.web;


import java.util.List;

import org.sid.dao.OFAvailabilityRepository;
import org.sid.dao.OFDetailRepository;
import org.sid.dao.OFRequestRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.OFAvailability;
import org.sid.entities.OFDetail;
import org.sid.entities.OFRequest;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/tables")
public class OpenFaultController {

	@Autowired
	private OFDetailRepository ofdr ;
	@Autowired
	private OFAvailabilityRepository ofar ;
	@Autowired
	private OFRequestRepository ofrr ;
	@Autowired
	private UserRepository usrep ;

	
	//detail return the name of the view even if the view is a ".html" 
	@RequestMapping(value="/detail") // When I go to : http://localhost/detail
	public String detail(Model model, 
			@RequestParam(name="page", defaultValue = "0")int page,
			@RequestParam(name="size", defaultValue = "100")int size) { 
		PageRequest paging = PageRequest.of(page, size);
		Page<OFDetail> pageDetail = ofdr.findAll(paging);
		model.addAttribute("detailTable", pageDetail.getContent()); //Je vais sur la vue pour afficher cette table 
		// Je vais créer le tableau des pages
		int[] pages = new int[pageDetail.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", page);
		return "detail";
	}
	 

	@RequestMapping(value="/availability") // When I go to : http://localhost/availability
	public String availability(Model model, 
			@RequestParam(name="page", defaultValue = "0")int page,
			@RequestParam(name="size", defaultValue = "100")int size) {
		PageRequest paging = PageRequest.of(page, size);
		Page<OFAvailability> pageAvailability = ofar.findAll(paging);
		model.addAttribute("availabilityTable", pageAvailability.getContent()); //Je vais sur la vue pour afficher cette table 
		// Je vais créer le tableau des pages
		int[] pages = new int[pageAvailability.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", page);
		return "availability";
	}
	
	
	//detail return the name of the view even if the view is a ".html" 
	@RequestMapping(value="/request") // When I go to : http://localhost/request
	public String request(Model model, 
			@RequestParam(name="page", defaultValue = "0")int page,
			@RequestParam(name="size", defaultValue = "100")int size) {
		PageRequest paging = PageRequest.of(page, size);
		Page<OFRequest> pageRequest = ofrr.findAll(paging);
		model.addAttribute("requestTable", pageRequest.getContent()); //Je vais sur la vue pour afficher cette table 
		// Je vais créer le tableau des pages
		int[] pages = new int[pageRequest.getTotalPages()];
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", page);
		return "request";
	}
		
	
	@RequestMapping(value="/users") 
	public String users(Model model) {
		List<User> users = usrep.findAll(); 
		model.addAttribute("tabUsers", users);
		return "users";
	}

}
