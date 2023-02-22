package com.example.demo.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.HomeService;



@RestController
public class HomeController
{
	@Autowired
	HomeService service;
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<User> saveUser(@RequestBody @Valid User user){
		User u1=service.saveUser(user);
        return new ResponseEntity<>(u1, HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<Iterable<User>> getAllUsers()
    {
        return ResponseEntity.ok(service.getALlUsers());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id)
    {
        return ResponseEntity.ok(service.getUser(id));
    }
    
    @DeleteMapping("/deletedata/{id}")
	 public String deletedata(@PathVariable ("id") int id)
   { 
		    service.deletebyid(id);
		   return "deleted successfully";
	
   }
}
