package com.leductoan.controller;



import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.leductoan.entity.Student;




@Controller
@RequestMapping("/")
public class trangchucontroller {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	@GetMapping
	@Transactional
  public String ViewTrangChu() {
		
		Session session=sessionFactory.getCurrentSession();
		
	      String sql="FROM student";
	      
	      List<Student> list=session.createQuery(sql).getResultList();
	      
	      for (Student student : list) {
			System.out.println(student.getName());
		}
	    
	      return "trangchu";
  }
	
	
	@PostMapping
	public String PostChiTiet(@RequestParam String name,ModelMap modeMap) {
		
		
		modeMap.addAttribute("name", name);
		return "chitiet";
	}
}