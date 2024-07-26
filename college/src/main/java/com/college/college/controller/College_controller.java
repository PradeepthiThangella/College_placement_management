package com.college.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.college.entity.College;
import com.college.college.service.College_service;

@RestController

public class College_controller
{
	
  @Autowired
  private College_service cs;
  
  @PostMapping("/college")
  public College registercollege(@RequestBody College C)
   {
	 return cs.registercollege(C);
   }

   @GetMapping("/college")
   public List<College> getcollege()
   {
	 return cs.getcollege();
   } 
   @PutMapping("/college/{id}")
	public College particularcollege(@PathVariable("id") Integer id,@RequestBody College c) 
   {
		return cs.updateCollege(id, c);
	}

  @DeleteMapping("/college/{id}")
  public void deletecollege(@PathVariable("id") Integer id)
{
	cs.deletecollege(id);

}
}
