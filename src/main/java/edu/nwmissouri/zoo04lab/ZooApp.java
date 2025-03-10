package edu.nwmissouri.zoo04lab;

import java.util.Scanner;

/**
 * ZooApp is a Zoo simulation created by 542 Section 05.
 *
 * @author Dr. Case and others
 */
public class ZooApp {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";

    // specify number of  animal types available 
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see animals
        System.out.println("Do you want to see animals (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What animals would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.print(" 1.Aardvark            ");
                System.out.print(" 2.Abyssinian          ");
                System.out.print(" 3.Arvicolinae         ");
                System.out.println(" 4.Asp                 ");
                System.out.print(" 5.Bearcat             ");
                System.out.print(" 6.BengalTiger         ");
                System.out.print(" 7.BlackJaguar         ");
                System.out.println(" 8.BlackPanther        ");
                System.out.print(" 9.Brachiosaurus       ");
                System.out.print("10.Buffalo             ");
                System.out.print("11.Cat                 ");
                System.out.println("12.Cheetah             ");
                System.out.print("13.CongoLion           ");
                System.out.print("14.Cow                 ");
                System.out.print("15.Crocodile           ");
                System.out.println("16.Dalmatian           ");
                System.out.print("17.Deer                ");
                System.out.print("18.Dinosaur            ");
                System.out.print("19.Duck                ");
                System.out.println("20.ElephantBird        ");
                System.out.print("21.Elephant            ");
                System.out.print("22.Emu                 ");
                System.out.print("23.FerociousTiger      ");
                System.out.println("24.Floppy              ");
                System.out.print("25.Frog                ");
                System.out.print("26.Gerenuk             ");
                System.out.print("27.Giraffe             ");
                System.out.println("28.Glyptodon           ");
                System.out.print("29.Goat                ");
                System.out.print("30.Griffin             ");
                System.out.print("31.HarpSeal            ");
                System.out.println("32.Hippopotamus        ");
                System.out.print("33.Kangaroo            ");
                System.out.print("34.Kangaroov           ");
                System.out.print("35.Koala               ");
                System.out.println("36.Liger               ");
                System.out.print("37.Lioness             ");
                System.out.print("38.Lion                ");
                System.out.print("39.MightyLion          ");
                System.out.println("40.MuleDeer            ");
                System.out.print("41.Okapi               ");
                System.out.print("42.Panda               ");
                System.out.print("43.Panthera            ");
                System.out.println("44.PolarBear           ");
                System.out.print("45.ProngHorn           ");
                System.out.print("46.Puma                ");
                System.out.print("47.Rabbit              ");
                System.out.println("48.RelayHorse          ");
                System.out.print("49.RoaringLion         ");
                System.out.print("50.Shoebill            ");
                System.out.print("51.SiberianTiger       ");
                System.out.println("52.Squirrel            ");
                System.out.print("53.Stag                ");
                System.out.print("54.StringRay           ");
                System.out.print("55.SunBear             ");
                System.out.println("56.TauntingTiger       ");
                System.out.print("57.Unicorn             ");
                System.out.print("58.Walrus              ");
                System.out.print("59.Xraytetra           ");
                System.out.println("60.YukonMoose          ");
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_ANIMAL_TYPES;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                        AardvarkGroup.create();
                        AardvarkGroup.run();
                    }
                    case 2 -> {
                        AbyssinianGroup.create();
                        AbyssinianGroup.run();
                    }
                    case 3 -> {
                        ArvicolinaeGroup.create();
                        ArvicolinaeGroup.run();
                    }
                    case 4 -> {
                        AspGroup.create();
                        AspGroup.run();
                    }
                    case 5 -> {
                        BearcatGroup.create();
                        BearcatGroup.run();
                    }
                    case 6 -> {
                        BengalTigerGroup.create();
                        BengalTigerGroup.run();
                    }
                    case 7 -> {
                        BlackJaguarGroup.create();
                        BlackJaguarGroup.run();
                    }
                    case 8 -> {
                 //       BlackPantherGroup.create();
                //        BlackPantherGroup.run();
                    }
                    case 9 -> {
                //        BrachiosaurusGroup.create();
                //        BrachiosaurusGroup.run();
                    }
                    case 10 -> {
                        BuffaloGroup.create();
                        BuffaloGroup.run();
                    }
                    case 11 -> {
                        CatGroup.create();
                        CatGroup.run();
                    }
                    case 12 -> {
                        CheetahGroup.create();
                        CheetahGroup.run();
                    }
                    case 13 -> {
                        CongoLionGroup.create();
                        CongoLionGroup.run();
                    }
                    case 14 -> {
                        CowGroup.create();
                        CowGroup.run();
                    }
                    case 15 -> {
                        CrocodileGroup.create();
                        CrocodileGroup.run();
                    }
                    case 16 -> {
                        DalmatianGroup.create();
                        DalmatianGroup.run();
                    }
                    case 17 -> {
                        DeerGroup.create();
                        DeerGroup.run();
                    }
                    case 18 -> {
                        DinosaurGroup.create();
                        DinosaurGroup.run();
                    }
                    case 19 -> {
                        DuckGroup.create();
                        DuckGroup.run();
                    }
                    case 20 -> {
                        ElephantBirdGroup.create();
                        ElephantBirdGroup.run();
                    }
                    case 21 -> {
                        ElephantGroup.create();
                        ElephantGroup.run();
                    }
                    case 22 -> {
                        EmuGroup.create();
                        EmuGroup.run();
                    }
                    case 23 -> {
                        FerociousTigerGroup.create();
                        FerociousTigerGroup.run();
                    }
                    case 24 -> {
                        FloppyGroup.create();
                        FloppyGroup.run();
                    }
                    case 25 -> {
                        FrogGroup.create();
                        FrogGroup.run();
                    }
                    case 26 -> {
                        GerenukGroup.create();
                        GerenukGroup.run();
                    }
                    case 27 -> {
                        GiraffeGroup.create();
                        GiraffeGroup.run();
                    }
                    case 28 -> {
                        GlyptodonGroup.create();
                        GlyptodonGroup.run();
                    }
                    case 29 -> {
                        GoatGroup.create();
                        GoatGroup.run();
                    }
                    case 30 -> {
                        GriffinGroup.create();
                        GriffinGroup.run();
                    }
                    case 31 -> {
                        HarpSealGroup.create();
                        HarpSealGroup.run();
                    }
                    case 32 -> {
                        HippopotamusGroup.create();
                        HippopotamusGroup.run();
                    }
                    case 33 -> {
                        KangarooGroup.create();
                        KangarooGroup.run();
                    }
                    case 34 -> {
                        KangaroovGroup.create();
                        KangaroovGroup.run();
                    }
                    case 35 -> {
                        KoalaGroup.create();
                        KoalaGroup.run();
                    }
                    case 36 -> {
                        LigerGroup.create();
                        LigerGroup.run();
                    }
                    case 37 -> {
                        LionessGroup.create();
                        LionessGroup.run();
                    }
                    case 38 -> {
                        LionGroup.create();
                        LionGroup.run();
                    }
                    case 39 -> {
                        MightyLionGroup.create();
                        MightyLionGroup.run();
                    }
                    case 40 -> {
                        MuleDeerGroup.create();
                        MuleDeerGroup.run();
                    }
                    case 41 -> {
                        OkapiGroup.create();
                        OkapiGroup.run();
                    }
                    case 42 -> {
                        PandaGroup.create();
                        PandaGroup.run();
                    }
                    case 43 -> {
                        PantheraGroup.create();
                        PantheraGroup.run();
                    }
                    case 44 -> {
                        PolarBearGroup.create();
                        PolarBearGroup.run();
                    }
                    case 45 -> {
                        ProngHornGroup.create();
                        ProngHornGroup.run();
                    }
                    case 46 -> {
                        PumaGroup.create();
                        PumaGroup.run();
                    }
                    case 47 -> {
                        RabbitGroup.create();
                        RabbitGroup.run();
                    }
                    case 48 -> {
                        RelayHorseGroup.create();
                        RelayHorseGroup.run();
                    }
                    case 49 -> {
                        RoaringLionGroup.create();
                        RoaringLionGroup.run();
                    }
                    case 50 -> {
                        ShoebillGroup.create();
                        ShoebillGroup.run();
                    }
                    case 51 -> {
                        SiberianTigerGroup.create();
                        SiberianTigerGroup.run();
                    }
                    case 52 -> {
                        SquirrelGroup.create();
                        SquirrelGroup.run();
                    }
                    case 53 -> {
                        StagGroup.create();
                        StagGroup.run();
                    }
                    case 54 -> {
                        StringRayGroup.create();
                        StringRayGroup.run();
                    }
                    case 55 -> {
                        SunBearGroup.create();
                        SunBearGroup.run();
                    }
                    case 56 -> {
                        TauntingTigerGroup.create();
                        TauntingTigerGroup.run();
                    }
                    case 57 -> {
                        UnicornGroup.create();
                        UnicornGroup.run();
                    }
                    case 58 -> {
                        WalrusGroup.create();
                        WalrusGroup.run();
                    }
                    case 59 -> {
                        XraytetraGroup.create();
                        XraytetraGroup.run();
                    }
                    case 60 -> {
                        YukonMooseGroup.create();
                        YukonMooseGroup.run();
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}
