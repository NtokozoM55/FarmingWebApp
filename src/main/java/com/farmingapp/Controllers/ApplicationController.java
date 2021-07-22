package com.farmingapp.Controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.farmingapp.Services.AdService;
import com.farmingapp.Services.OfferService;


@Controller
public class ApplicationController {
	
	@Autowired
	private AdService adService;
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping("/home")
	private String home(HttpServletRequest request) {
		//request.setAttribute("mode", "MODE_HOME");
		return "home";
	}
	
	@RequestMapping("/supplier")
	private String welcome(HttpServletRequest request) {
		//request.setAttribute("mode", "MODE_SUPPLIERHOME");
		return "supplier";
	}
	
	@RequestMapping("/postAd")
	private String supplierPost(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_POSTAD");
		return "supplier";
	}

	@RequestMapping("/farmer")
	private String farmerPage(HttpServletRequest request) {
		//request.setAttribute("mode", "MODE_POSTAD");
		return "farmer";
	}
	
	
	@GetMapping("/cropAds")
	private String ShowAllCropAds(HttpServletRequest request) {
		request.setAttribute("ads",adService.showAllAds());
		request.setAttribute("mode", "MODE_CROPAD");
		return "farmer";
	}
	
	
	@GetMapping("/OffersReceived")
	private String ShowAllOffers(HttpServletRequest request) {
		request.setAttribute("offers",offerService.showAllOffers());
		request.setAttribute("mode", "MODE_ALLOFFERS");
		return "supplier";
	}
	
	
	@RequestMapping("/sellCrops")
	private String SellCropsPage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_SELLCROPS");
		return "farmer";
	}
	
	@PostMapping("/addAdvertisement")
	public String saveAdvertisement(@RequestParam("supplierid") int supplierid,
									@RequestParam("file") MultipartFile file, 
									@RequestParam("cropname") String cropname, 
									@RequestParam("quantity") String quantity ) {
		
		adService.saveAdvertisement(supplierid, file, cropname,quantity);
		
		return "supplier";
		
	}
	
	
	@PostMapping("/makeOffer")
	public String sendOffer(@RequestParam("farmerid") int farmerid,
									@RequestParam("quantity") int quantity, 
									@RequestParam("price") int price ) {
		
		offerService.makeOffer(farmerid, quantity, price) ;
		
		return "farmer";
		
	}
	
	
/*	@RequestMapping("/cropAds")
	private String farmerCropAds(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_CROPAD");
		return "farmer";
	}
	
*/	
	/*@GetMapping("/cropAds")
	public String showCropAds() {
		return "farmer";
	}*/

}
