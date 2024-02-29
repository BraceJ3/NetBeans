/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project10;

/**
 *
 * @author Big Brace
 */
public class Personalnformation {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;     
    }
    public void setName(String nameGiven){
        name=nameGiven;
    }
    public void setAddress(String addressGiven){
        address=addressGiven;
    }
    public void setAge(int ageGiven){
        age=ageGiven;
    }
    public void setPhoneNumber(String phoneNumberGiven){
      phoneNumber=phoneNumberGiven;  
    }
    public Personalnformation(){
        name="";
        address="";
        age=0;
        phoneNumber="(000) 123 - 4567";            
    }
}
