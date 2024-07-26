package com.college.college.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.college.entity.College;
import com.college.college.repository.College_repo;

@Service
   public class College_service {
@Autowired 
   public College_repo cr;

//create

   public College registercollege(College C) 
   {
	   return cr.save(C);
   }
   
   //read
   public List<College> getcollege() {
	   return(List<College>) cr.findAll();
   }
   
   //update
   
   public College updateCollege(Integer id, College c)
   {
       return cr.save(c);
   }
   
   //delete
   public void deletecollege(Integer id)
   {
	   cr.deleteById(id);
   }

}
