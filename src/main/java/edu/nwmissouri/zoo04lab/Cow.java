/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Cow class (derived subclass of the superclass Animal)
 * @author Harika_Chintala
 */
public class Cow extends Animal{
    
    /**
     * Cow Constructor
     * @param name - the name of this cow
     */
    public Cow(String name){
        super(name);
    }
     //@Override
    public void eat(){
        System.out.println(" I eat like Yumm yumm yumm!!");
    }
    @Override
    public void speak(){
        System.out.println(" I am a Cow.. "+this.name);
    }
    //@Override
    public void child(){
        System.out.println(" I can give birth to one child at once");
    }
     //@Override
    public void color(){
        System.out.println("I can be in black, brown and white color ");
    }
    @Override
    public void move() {
        System.out.println("When I move, I move, move, move...");
    }
}
