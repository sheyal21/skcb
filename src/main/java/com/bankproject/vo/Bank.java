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
public class Bank {
   private String bankName;
   private String website;
   private int code;
   private String address;
   private int phone;
   ArrayList <Employee> employeeList;
   ArrayList <Customer> customerList;
   ArrayList <Account> accountList;
   
   

    public Bank() {
    }

    public Bank(String bankName, String website, int code, String address, int phone, ArrayList<Employee> employeeList, ArrayList<Customer> customerList, ArrayList<Account> accountList) {
        this.bankName = bankName;
        this.website = website;
        this.code = code;
        this.address = address;
        this.phone = phone;
        this.employeeList = employeeList;
        this.customerList = customerList;
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "Bank{" + "bankName=" + bankName + ", website=" + website + ", code=" + code + ", address=" + address + ", phone=" + phone + ", employeeList=" + employeeList + ", customerList=" + customerList + ", accountList=" + accountList + '}';
    }
   
   
  

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
   
    
}
