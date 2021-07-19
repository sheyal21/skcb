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
public class FullTimeEmployee extends Employee {
  float salary;


    public FullTimeEmployee(float salary, String fullname, int id, String designation) {
        super(fullname, id, designation);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "salary=" + salary + super.toString()+'}';
    }
  

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
  
  
  
  
  
}
