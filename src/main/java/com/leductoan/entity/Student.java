package com.leductoan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "student")
@Table

public class Student {
	  @Id
	  @Column(name = "ID")
	   

	 private Integer id;
	  @Column(name = "NAME")
	   private String name;
	  @Column(name = "AGE")
	  private Integer age;
	 
	  

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
}
