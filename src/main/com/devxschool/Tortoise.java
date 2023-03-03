package com.devxschool;

// TODO SETUP THE CLASS
public class Tortoise extends AnimalData {
    //- 'printSpeedAndGroup': print SUPER FAST if more than 1, FAST if more than 0.6, MEDIUM if more than 0.3, and SLOW if less or equal to 0.3.
    //         *     After, assign moveType to crawl
    @Override
    void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed >= 0) {
            System.out.println("Average speed is: " + avgSpeed);
        }
        if (avgSpeed >= 0 && avgSpeed <= 0.3) {
            System.out.println("Animal group is: SLOW");
        } else if (avgSpeed > 0.3 && avgSpeed <= 0.6) {
            System.out.println("Animal group is: MEDIUM");
        } else if (avgSpeed > 0.6 && avgSpeed <= 1) {
            System.out.println("Animal group is: FAST");
        } else if (avgSpeed > 1) {
            System.out.println("Animal group is:SUPER FAST");
        }
        setMoveType("crawl");
    }

}
