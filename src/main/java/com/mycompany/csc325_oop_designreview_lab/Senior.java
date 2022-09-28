/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author shameedjob
 */
public class Senior extends Student{

    public Senior(String name, short age, int credits) {
        super(name, age, credits);
    }
    
    
    @Override
    public String toString()
    {
        return String.format("%s, %s, Senior, %d, %f", getName(), getAddress(), getCredits(), getGpa());
    }
}
