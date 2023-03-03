package com.devxschool;

// TODO SETUP THE CLASS
public class AnimalData {
    //- 'name' String instance variable
    //         *      * default getter
    //         *      * setter that accepts only values longer than 2
    //         *  - 'moveType' String instance variable
    //         *      * default getter
    //         *      * setter is assigned only if it is either: fly, swim, run, crawl, and jump
    //         *  - 'sound' String instance variable
    //         *      * default getter
    //         *      * setter that accepts only values longer than 1
    //         *  - 'printSpeedAndGroup' method that accepts double avgSpeed as parameter.
    //         *       * print speed if it's not invalid (less than 0). Ex: Average speed is: 13.6
    //         *       * Print group depending on speed (SUPER FAST if more than 30, FAST if more than 20,
    //         *         MEDIUM if more than 10, and SLOW if less than or equal to 10). Ex: Animal group is: MEDIUM
    //         *  - 'toString' method in the format: className{name='Name', moveType='MoveType', sound='sound'}
    private String name;
    private String moveType;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        //fly, swim, run, crawl, and jump
        switch (moveType.toLowerCase()) {
            case "fly":
            case "swim":
            case "run":
            case "crawl":
            case "jump":
                this.moveType = moveType;
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if (name.length() > 1) {
            this.sound = sound;
        }
    }

    void printSpeedAndGroup(double avgSpeed) {
        //Print group depending on speed (SUPER FAST if more than 30, FAST if more than 20,
        //  MEDIUM if more than 10, and SLOW if less than or equal to 10). Ex: Animal group is: MEDIUM
        if (avgSpeed >= 0) {
            System.out.println("Average speed is: " + avgSpeed);
        }
        if (avgSpeed >= 0 && avgSpeed <= 10) {
            System.out.println("Animal group is: SLOW");
        } else if (avgSpeed > 10 && avgSpeed <= 20) {
            System.out.println("Animal group is: MEDIUM");
        } else if (avgSpeed > 20 && avgSpeed <= 30) {
            System.out.println("Animal group is: FAST");
        } else if (avgSpeed > 30) {
            System.out.println("Animal group is: SUPER FAST");
        }

    }


    //className{name='Name', moveType='MoveType', sound='sound'}
    //"AnimalData{name='Animal Test', moveType='swim', sound='boom'}\n"
    @Override
    public String toString() {
        return "AnimalData{name='" + getName() + "', moveType='" + getMoveType()
                + "', sound='" + getSound() + "'}\n";
    }
}
