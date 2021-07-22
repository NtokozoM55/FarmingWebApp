package com.farmingapp.Services;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.farmingapp.Models.AdModel;
import com.farmingapp.Models.FarmerModel;
import com.farmingapp.Models.OfferModel;
import com.farmingapp.Repository.OfferRepository;


@Service
@Transactional
public class OfferService {

	@Autowired
	public final OfferRepository offerRepository;
	
	
	
	public OfferService(OfferRepository offerRepository) {
		this.offerRepository = offerRepository;
		
	}

	
	
	public List<OfferModel> showAllOffers(){
		List<OfferModel> offers = new ArrayList<OfferModel>();
		for(OfferModel offer:offerRepository.findAll()) {
			offers.add(offer);
		}
		return offers;
	}

	
	
	public void
	/*saveAdvertisement(int supplierid, MultipartFile file, String cropname, String postdate, String quantity, String status)*/
	makeOffer(int farmerid, int quantity , int price ) {
		
		OfferModel offer = new OfferModel();
	
		offer.setAdid(1);
		offer.setFarmerid(farmerid);
		offer.setFarmername("farmer");
		offer.setQuantity(quantity);
		offer.setPrice(price);
		offer.setStatus("pending");		
		
		offerRepository.save(offer);
	}
	
}


	







