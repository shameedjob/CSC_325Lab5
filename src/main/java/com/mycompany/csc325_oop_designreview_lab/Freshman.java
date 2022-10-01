/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author shameedjob
 */
public class Freshman extends Student {

    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }
    
     @Override
    public String toString()
    {
        //Outputs all of the data as a string but specifies that it is a Freshman
        return String.format("%s, %s, Freshman, %d, %f", getName(), getAddress(), getCredits(), getGpa());
    }
}
