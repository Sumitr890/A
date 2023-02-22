package com.example.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User,Integer>
{
	User findById(int id);

}
