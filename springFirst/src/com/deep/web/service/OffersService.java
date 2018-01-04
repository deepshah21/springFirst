package com.deep.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.web.dao.Offer;
import com.deep.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {

		private OffersDAO offersDao;
		
		@Autowired
		public void setOffersDAO(OffersDAO offersDAO) {
			this.offersDao = offersDAO;
		}
		
		public List<Offer> getCurrentOffer(){
			return offersDao.getOffers();
		}
		
		public void create(Offer offer){
			offersDao.create(offer);
		}
		
		
}
