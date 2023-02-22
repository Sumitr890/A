package com.example.demo.service;



import com.example.demo.model.User;

public interface HomeService 
{

public User saveUser(User user);

public Iterable<User> getALlUsers();

public User getUser(int id);

public void deletebyid(int id);


	


}
