package com.example.demo.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositary.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
   @Autowired
   HomeRepository hr;

@Override
public User saveUser(User user) {
	
	return hr.save(user);
}

@Override
public Iterable<User> getALlUsers() {
	
	return hr.findAll();
}

@Override
public User getUser(int id) {
	User u=hr.findById(id);
	return u ;
}

@Override
public void deletebyid(int id) {
	hr.deleteById(id);
	
}
	

}
