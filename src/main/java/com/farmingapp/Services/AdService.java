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
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.farmingapp.Models.AdModel;
import com.farmingapp.Repository.AdRepository;

@Service
@Transactional
public class AdService {
	
@Autowired
public final AdRepository adRepository;

public AdService(AdRepository adRepository) {
	this.adRepository = adRepository;
}
	
public List<AdModel> showAllAds(){
	List<AdModel> ads = new ArrayList<AdModel>();
	for(AdModel ad:adRepository.findAll()) {
		ads.add(ad);
	}
	return ads;
}


public void
/*saveAdvertisement(int supplierid, MultipartFile file, String cropname, String postdate, String quantity, String status)*/
saveAdvertisement(int supplierid, MultipartFile file, String cropname, String quantity) {
	
	AdModel ad = new AdModel();
	String postdate;
	String status = "pending";
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDateTime now = LocalDateTime.now();
	postdate = dtf.format(now);
	
	
	
	String filename = StringUtils.cleanPath(file.getOriginalFilename());
	if(filename.contains("..")) {
		System.out.println("not a valid file");
	}try {
		ad.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
	}catch(IOException e){
		e.printStackTrace();
	}
	
	
	ad.setSupplierid(supplierid);
	ad.setCropname(cropname);
	ad.setPostdate(postdate);
	ad.setQuantity(quantity);
	ad.setStatus(status);
	ad.setImage(filename);
	
	
	adRepository.save(ad);
}
}


