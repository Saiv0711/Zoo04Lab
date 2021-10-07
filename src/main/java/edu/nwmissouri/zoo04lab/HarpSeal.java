/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * HarpSeal class (derived subclass of the superclass Animal)
 * @author Rehana Naguru
 */
public class HarpSeal extends Animal{
    /*
    HarpSeal Constructor 
    @param name -the name of this HarpSeal
    */
    public HarpSeal(String name){
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.println("I am HarpSeal and I communicate vocally by making noise with my throat and air.");
    }
    @Override
    public void move(){
        System.out.println("I swim in sea iceand I move on ice by pulling my front flippers, which have strong claws.");
    } 
    
    
    
}

