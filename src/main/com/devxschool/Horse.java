package com.devxschool;

// TODO SETUP THE CLASS
public class Horse extends AnimalData {
    // Now configure the Horse class:
    //         *  - 'printSpeedAndGroup': print SUPER FAST if more than 60, FAST if more than 40, MEDIUM if more than 20, and SLOW if less or equal to 20.
    //         *     After, assign moveType to run
    @Override
    void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed >= 0) {
            System.out.println("Average speed is: " + avgSpeed);
        }
        if (avgSpeed >= 0 && avgSpeed <= 20) {
            System.out.println("Animal group is: SLOW");
        } else if (avgSpeed > 20 && avgSpeed <= 40) {
            System.out.println("Animal group is: MEDIUM");
        } else if (avgSpeed > 40 && avgSpeed <= 60) {
            System.out.println("Animal group is: FAST");
        } else if (avgSpeed > 60) {
            System.out.println("Animal group is:SUPER FAST");
        }
        setMoveType("run");
    }
}
