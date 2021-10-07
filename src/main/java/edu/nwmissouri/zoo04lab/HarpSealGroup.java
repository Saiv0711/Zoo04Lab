package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;


/**
 * Provides methods to create and run a group of HarpSeals
 * @author Rehana Naguru
 */
public class HarpSealGroup {
     private static ArrayList<HarpSeal> myGroup;

    /**
     * Create a static group of HarpSeal
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        HarpSeal a = new HarpSeal("Harpie");
        myGroup.add(a);
        myGroup.add(new HarpSeal("Sweety"));
        myGroup.add(new HarpSeal("Seal"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        System.out.println("Look at the HarpSeal!");
        myGroup.forEach(HarpSeal -> {
            HarpSeal.speak();
            HarpSeal.move();
        });
        System.out.println("Nice HarpSeal - that was fun!");
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    
}

