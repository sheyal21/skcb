/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankproject.vo;

import java.util.ArrayList;

/**
 *
 * @author brave
 */
public class Employee {
    
  private String fullname;
  private int id;
  private String designation;

    public Employee() {
    }

    public Employee(String fullname, int id, String designation) {
        this.fullname = fullname;
        this.id = id;
        this.designation = designation;
 
    }

    @Override
    public String toString() {
        return "Employee{" + "fullname=" + fullname + ", id=" + id + " , designation="  + '}';
    }
  
  

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

   
 
    
}
