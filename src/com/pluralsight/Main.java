package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*
    https://programmingbydoing.com/

    Choose your own short adventure - Assignment #33
     */
    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println("WELCOME TO KRYSTIN'S SHORT ADVENTURE!");
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"? ");
        String firstAnswer = keyboard.next();
//ANSWER #1 - KITCHEN
        if (firstAnswer.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long counter-top with dirty dishes everywhere. Off to one side there is, as you'd " +
                    "expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
            String secondAnswer = keyboard.next();
//ANSWER #2 - REFRIGERATOR
            if (secondAnswer.equalsIgnoreCase("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you " +
                        "like to eat some of the food? (\"yes\" or \"no\")");
                String thirdAnswer = keyboard.next();
//ANSWER #3 - YES/NO
                if (thirdAnswer.equalsIgnoreCase("no")) {
                    System.out.println("You die of starvation...eventually. Thanks for playing!");
                } else {
                    System.out.println("You take a bite of some rather moldy cheese and immediately start convulsing. " +
                            "When you crumple to the ground and begin to black out, your last thought is. This was a " +
                            "really cheezy adventure..... Thanks for playing!");
                }
            }
//ANSWER #2 - CABINET
            else
                System.out.println("All of the shelves inside the cabinet have been removed and there is a " +
                        "giant hole in the back which leads through the wall and down a dark passageway. Do you" +
                        " want to try the passageway? (\"yes\" or \"no\")");
            String thirdAnswer = keyboard.next();
//ANSWER #3 - YES/NO
            if (thirdAnswer.equalsIgnoreCase("no")) {
                System.out.println("What a wimp. Pretty bogus adventure if you arne't up for some adventuring... " +
                        "Thanks for playing!");
            } else {
                System.out.println("You walk through the opening and are blinded by the darkness. You hear footsteps" +
                        " behind you and turn just in time to see a dark figure looming over you. You scream, but" +
                        " it's too late. You are hit over the head, dragged outside to the cliffs and thrown into " +
                        "the water crashing against the rocks below. Thanks for playing!");
            }
        }
//ANSWER #1 - UPSTAIRS
        else {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There" +
                    " is also a \"bathroom\" off the hallway. Where would you like to go?");
            String secondAnswer = keyboard.next();
//ANSWER #2 - BEDROOM
            if (secondAnswer.equalsIgnoreCase("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive looking hardwood furniture. The bed" +
                        " is unmade. In the back of the room, the closet door is ajar. Would you like to open" +
                        " the door? (\"yes\" or \"no\")");
                String thirdAnswer = keyboard.next();
//ANSWER #3 - YES/NO
                if (thirdAnswer.equalsIgnoreCase("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing!");
                } else {
                    System.out.println("You open the creaky doors to the closet and find.......a dusty closet. Wah wah." +
                            " That was rather anti-climactic. Thanks for playing!");
                }
            }
//ANSWER #2 - BATHROOM
            else {
                System.out.println("The bathroom is a slimy mess and you hear water dripping behind the shower curtain." +
                        " Do you peek behind the curtain to tighten the spigot so it stops dripping? (\"yes\" or \"no\")");
                String thirdAnswer = keyboard.next();
                //ANSWER #3 - YES/NO
                if (thirdAnswer.equalsIgnoreCase("no")) {
                    System.out.println("Well, it isn't your house after all so why should you care? Thanks for playing!");
                } else {
                    System.out.println("You reach for the shower curtain and just before you pull it aside to view the interior of the shower" +
                            " you are pushed from behind, fall into the shower and drown in the full tub of water. That's" +
                            " what you get for trying to be a good samaritan. Thanks for playing!");
                }
            }
        }
    }
}

