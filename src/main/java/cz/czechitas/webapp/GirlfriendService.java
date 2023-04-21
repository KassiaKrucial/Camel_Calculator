package cz.czechitas.webapp;

import java.util.*;

public class GirlfriendService {
    
    GirlfriendForm girlfriendForm = new GirlfriendForm();

    public int camelsForAge() {

        int randomIntForAge = 0;

        if (girlfriendForm.getAge() < 101) {
            randomIntForAge = new Random().nextInt(25);
        }

        return randomIntForAge;
    }
    
    public int camelsForHeight() {

        int randomIntForHeight = 0;

        if (girlfriendForm.getHeight() < 221) {
             randomIntForHeight = new Random().nextInt(25);
        }

        return randomIntForHeight;
    }

    public int camelsForHaircolor() {

        int randomIntForHaircolor = 0;

        if (girlfriendForm.getHaircolor() == "blonde" ||
                girlfriendForm.getHaircolor() == "ginger" ||
                girlfriendForm.getHaircolor() == "brown" ||
                girlfriendForm.getHaircolor() == "black" ||
                girlfriendForm.getHaircolor() == "gray") {
            randomIntForHaircolor = new Random().nextInt(25);
        }

        return randomIntForHaircolor;
    }

    public int camelsForEyecolor() {

        int randomIntForEyecolor = 0;

        if (girlfriendForm.getEyecolor() == "gray" ||
                girlfriendForm.getEyecolor() == "blue" ||
                girlfriendForm.getEyecolor() == "green" ||
                girlfriendForm.getEyecolor() == "brown" ||
                girlfriendForm.getEyecolor() == "milky") {
            randomIntForEyecolor = new Random().nextInt(25);
        }

        return randomIntForEyecolor;
    }

    public int camelsForFigure() {

        int randomIntForFigure = 0;

        if (girlfriendForm.getFigure() == "blonde" ||
                girlfriendForm.getFigure() == "ginger" ||
                girlfriendForm.getFigure() == "brown" ||
                girlfriendForm.getFigure() == "black" ||
                girlfriendForm.getFigure() == "gray") {
            randomIntForFigure = new Random().nextInt(25);
        }

        return randomIntForFigure;
    }

}
