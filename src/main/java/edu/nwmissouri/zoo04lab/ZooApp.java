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

    // specify number of  animal types available - TODO: NEED TO AUTOUPDATE****
    private static final int NUMBER_ANIMAL_TYPES = 54;

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
                // TODO: NEED TO AUTOUPDATE THE MENU *************
                System.out.println("What animals would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.println("1. Aardvark");
                System.out.println("2. Abyssinian");
                System.out.println("3. Arvicolinae");
                System.out.println("4. Asp");
                System.out.println("5. Bearcat");
                System.out.println("6. BengalTiger");
                System.out.println("7. BlackJaguar");
                System.out.println("8. BlackPanther");
                System.out.println("9. Buffalo");
                System.out.println("10. Cat");
                System.out.println("11. Cheetah");
                System.out.println("12. CongoLion");
                System.out.println("13. Cow");
                System.out.println("14. Crocodile");
                System.out.println("15. Dalmatian");
                System.out.println("16. Deer");
                System.out.println("17. Dinosaur");
                System.out.println("18. Duck");
                System.out.println("19. ElephantBird");
                System.out.println("20. Elephant");
                System.out.println("21. Emu");
                System.out.println("22. FerociousTiger");
                System.out.println("23. Floppy");
                System.out.println("24. Gerenuk");
                System.out.println("25. Giraffe");
                System.out.println("26. Glyptodon");
                System.out.println("27. Goat");
                System.out.println("28. Griffin");
                System.out.println("29. HarpSeal");
                System.out.println("30. Hippopotamus");
                System.out.println("31. Kangaroo");
                System.out.println("32. Kangaroov");
                System.out.println("33. Koala");
                System.out.println("34. Lioness");
                System.out.println("35. Lion");
                System.out.println("36. MightyLion");
                System.out.println("37. MuleDeer");
                System.out.println("38. Okapi");
                System.out.println("39. Panda");
                System.out.println("40. Panthera");
                System.out.println("41. PolarBear");
                System.out.println("42. Puma");
                System.out.println("43. Rabbit");
                System.out.println("44. RelayHorse");
                System.out.println("45. RoaringLion");
                System.out.println("46. Shoebill");
                System.out.println("47. SiberianTiger");
                System.out.println("48. Squirrel");
                System.out.println("49. Stag");
                System.out.println("50. StringRay");
                System.out.println("51. SunBear");
                System.out.println("52. Walrus");
                System.out.println("53. Xraytetra");
                System.out.println("54. YukonMoose");

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
                    case 8 -> {
                        BlackPantherGroup.create();
                        BlackPantherGroup.run();
                    }
                    case 9 -> {
                        BuffaloGroup.create();
                        BuffaloGroup.run();
                    }
                    case 10 -> {
                        CatGroup.create();
                        CatGroup.run();
                    }
                    case 11 -> {
                        CheetahGroup.create();
                        CheetahGroup.run();
                    }
                    case 12 -> {
                        CongoLionGroup.create();
                        CongoLionGroup.run();
                    }
                    case 13 -> {
                        CowGroup.create();
                        CowGroup.run();
                    }
                    case 14 -> {
                        CrocodileGroup.create();
                        CrocodileGroup.run();
                    }
                    case 15 -> {
                        DalmatianGroup.create();
                        DalmatianGroup.run();
                    }
                    case 16 -> {
                        DeerGroup.create();
                        DeerGroup.run();
                    }
                    case 18 -> {
                        DuckGroup.create();
                        DuckGroup.run();
                    }
                    case 19 -> {
                        ElephantBirdGroup.create();
                        ElephantBirdGroup.run();
                    }
                    case 20 -> {
                        ElephantGroup.create();
                        ElephantGroup.run();
                    }
                    case 21 -> {
                        EmuGroup.create();
                        EmuGroup.run();
                    }
                    case 22 -> {
                        FerociousTigerGroup.create();
                        FerociousTigerGroup.run();
                    }
                    case 23 -> {
                        FloppyGroup.create();
                        FloppyGroup.run();
                    }
                    case 24 -> {
                        GerenukGroup.create();
                        GerenukGroup.run();
                    }
                    case 25 -> {
                        GiraffeGroup.create();
                        GiraffeGroup.run();
                    }
                    case 26 -> {
                        GlyptodonGroup.create();
                        GlyptodonGroup.run();
                    }
                    case 27 -> {
                        GoatGroup.create();
                        GoatGroup.run();
                    }
                    case 28 -> {
                        GriffinGroup.create();
                        GriffinGroup.run();
                    }
                    case 29 -> {
                        HarpSealGroup.create();
                        HarpSealGroup.run();
                    }
                    case 30 -> {
                        HippopotamusGroup.create();
                        HippopotamusGroup.run();
                    }
                    case 31 -> {
                        KangarooGroup.create();
                        KangarooGroup.run();
                    }
                    case 32 -> {
                        KangaroovGroup.create();
                        KangaroovGroup.run();
                    }
                    case 33 -> {
                        KoalaGroup.create();
                        KoalaGroup.run();
                    }
                    case 34 -> {
                        LionessGroup.create();
                        LionessGroup.run();
                    }
                    case 35 -> {
                        LionGroup.create();
                        LionGroup.run();
                    }
                    case 36 -> {
                        MightyLionGroup.create();
                        MightyLionGroup.run();
                    }
                    case 37 -> {
                        MuleDeerGroup.create();
                        MuleDeerGroup.run();
                    }
                    case 38 -> {
                        OkapiGroup.create();
                        OkapiGroup.run();
                    }
                    case 39 -> {
                        PandaGroup.create();
                        PandaGroup.run();
                    }
                    case 40 -> {
                        PantheraGroup.create();
                        PantheraGroup.run();
                    }
                    case 41 -> {
                        PolarBearGroup.create();
                        PolarBearGroup.run();
                    }
                    case 42 -> {
                        PumaGroup.create();
                        PumaGroup.run();
                    }
                    case 43 -> {
                        RabbitGroup.create();
                        RabbitGroup.run();
                    }
                    case 44 -> {
                        RelayHorseGroup.create();
                        RelayHorseGroup.run();
                    }
                    case 45 -> {
                        RoaringLionGroup.create();
                        RoaringLionGroup.run();
                    }
                    case 46 -> {
                        ShoebillGroup.create();
                        ShoebillGroup.run();
                    }
                    case 48 -> {
                        SquirrelGroup.create();
                        SquirrelGroup.run();
                    }
                    case 49 -> {
                        StagGroup.create();
                        StagGroup.run();
                    }
                    case 50 -> {
                        StringRayGroup.create();
                        StringRayGroup.run();
                    }
                    case 51 -> {
                        SunBearGroup.create();
                        SunBearGroup.run();
                    }
                    case 52 -> {
                        WalrusGroup.create();
                        WalrusGroup.run();
                    }
                    case 53 -> {
                        XraytetraGroup.create();
                        XraytetraGroup.run();
                    }
                    case 54 -> {
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
