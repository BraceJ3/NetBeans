/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project10;

/**
 *
 * @author Big Brace
 */
public class PersonalInformationTest {
    public static void main(String [] args){
        Personalnformation me=new Personalnformation();
        Personalnformation family= new Personalnformation();
        Personalnformation friend=new Personalnformation();
        
        me.setName("Jalen");
        friend.setName("Chris");
        family.setName("Landyn");
        
        me.setAge(19);
        friend.setAge(19);
        family.setAge(10);
        
        me.setAddress("Rock Hill");
        friend.setAddress("Rock Hill");
        family.setAddress("Rock Hill");
        
        me.setPhoneNumber("803 123 4567");
        friend.setPhoneNumber("803 123 8342");
        family.setPhoneNumber("803 123 3456");
        
        System.out.println("Name\t\tAddress\t\tAge\t\tPhone Number");
        //me
        System.out.println(me.getName()+"\t\t"+me.getAddress()+"\t\t"+me.getAge()+"\t\t"+me.getPhoneNumber());
        //friend
        System.out.println(friend.getName()+"\t\t"+friend.getAddress()+"\t\t"+friend.getAge()+"\t\t"+friend.getPhoneNumber());
        //family
        System.out.println(family.getName()+"\t\t"+family.getAddress()+"\t\t"+family.getAge()+"\t\t"+family.getPhoneNumber());
    }
}
