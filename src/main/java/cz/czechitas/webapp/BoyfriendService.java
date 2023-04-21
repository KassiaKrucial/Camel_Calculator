package cz.czechitas.webapp;

import java.util.*;

public class BoyfriendService {

    BoyfriendForm boyfriendForm = new BoyfriendForm();

    public int camelsForAge() {

        int randomIntForAge = 0;

        if (boyfriendForm.getAge() < 101) {
            randomIntForAge = new Random().nextInt(25);
        }

        return randomIntForAge;
    }

    public int camelsForHeight() {

        int randomIntForHeight = 0;

        if (boyfriendForm.getHeight() < 221) {
            randomIntForHeight = new Random().nextInt(25);
        }

        return randomIntForHeight;
    }

    public int camelsForHaircolor() {

        int randomIntForHaircolor = 0;

        if (boyfriendForm.getHaircolor() == "blonde" ||
                boyfriendForm.getHaircolor() == "ginger" ||
                boyfriendForm.getHaircolor() == "brown" ||
                boyfriendForm.getHaircolor() == "black" ||
                boyfriendForm.getHaircolor() == "gray") {
            randomIntForHaircolor = new Random().nextInt(25);
        }

        return randomIntForHaircolor;
    }

    public int camelsForEyecolor() {

        int randomIntForEyecolor = 0;

        if (boyfriendForm.getEyecolor() == "gray" ||
                boyfriendForm.getEyecolor() == "blue" ||
                boyfriendForm.getEyecolor() == "green" ||
                boyfriendForm.getEyecolor() == "brown" ||
                boyfriendForm.getEyecolor() == "milky") {
            randomIntForEyecolor = new Random().nextInt(25);
        }

        return randomIntForEyecolor;
    }

    public int camelsForFigure() {

        int randomIntForFigure = 0;

        if (boyfriendForm.getFigure() == "blonde" ||
                boyfriendForm.getFigure() == "ginger" ||
                boyfriendForm.getFigure() == "brown" ||
                boyfriendForm.getFigure() == "black" ||
                boyfriendForm.getFigure() == "gray") {
            randomIntForFigure = new Random().nextInt(25);
        }

        return randomIntForFigure;
    }

}
