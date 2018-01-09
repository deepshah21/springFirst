package com.deep.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.web.dao.Offer;
import com.deep.web.dao.OffersDAO;
import com.deep.web.dao.User;
import com.deep.web.dao.UsersDAO;

@Service("usersService")
public class UsersService {

		private UsersDAO usersDao;
		
		@Autowired 
		public void setUsersDao(UsersDAO usersDao) {
			this.usersDao = usersDao;
		}

		public void create(User user){
			usersDao.create(user);
		}
		
		
}
