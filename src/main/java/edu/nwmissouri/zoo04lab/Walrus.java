/*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Walrus class,derived subclass from the superclass Animal)
 * @author Rehaman Naguru Abdur
 */
public class Walrus extends Animal {

    //@param name
    public Walrus(String name) { // walrus constructor with parameter
        super(name);
    }

    

     @Override
    public void speak() {//method
        System.out.println("I'm walrus, I growls, taps and make bell-like sounds below water.");
    }

    @Override
    public void move() { //method
        System.out.println("I move move and run");
    }

}
