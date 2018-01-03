package com.deep.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deep.web.dao.Offer;
import com.deep.web.service.OffersService;

@Controller
public class SpringContoller {

	/*@RequestMapping("/")
	public ModelAndView ShowHome(HttpSession session){
		ModelAndView mv = new ModelAndView("index");
		Map<String, Object> model = mv.getModel();
		model.put("name", "deep");
		session.setAttribute("Deep", "shah");
		return mv;
	}*/
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String ShowOffers(Model model){
		
		List<Offer> offers = offersService.getCurrentOffer();
		model.addAttribute("offers", offers);
		model.addAttribute("name", "deep");
		return "offers";
	}
	
	@RequestMapping("/createOffer")
	public String createOffer(Model model){
		
		List<Offer> offers = offersService.getCurrentOffer();
		model.addAttribute("offers", offers);
		model.addAttribute("name", "deep");
		return "createoffer";
	}
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test(Model model,@RequestParam("id")String id){

		model.addAttribute("name", id);
		return "index";
	}
}
