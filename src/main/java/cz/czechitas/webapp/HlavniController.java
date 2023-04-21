package cz.czechitas.webapp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.thymeleaf.expression.*;

@Controller
public class HlavniController {

    GirlfriendForm girlfriendForm;
    BoyfriendForm boyfriendForm;

    GirlfriendService girlfriendService = new GirlfriendService();
    BoyfriendService boyfriendService = new BoyfriendService();

    @RequestMapping("/")
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/girlfriend", method = RequestMethod.GET)
    public ModelAndView zobrazGirlfriend() {
        ModelAndView modelAndView = new ModelAndView("girlfriend");

        girlfriendForm = new GirlfriendForm();

        List<Integer> ageList = new ArrayList<>();
        for (int i = 16; i < 101; i++) {
            ageList.add(i);
        }
        modelAndView.addObject("ageList", ageList);

        List<Integer> heightList = new ArrayList<>();
        for (int j = 130; j < 211; j++) {
            heightList.add(j);
        }
        modelAndView.addObject("heightList", heightList);

        List<String> haircolorList = new ArrayList<>();
        haircolorList.add("blonde");
        haircolorList.add("ginger");
        haircolorList.add("brown");
        haircolorList.add("black");
        haircolorList.add("gray");
        modelAndView.addObject("haircolorList", haircolorList);

        List<String> eyecolorList = new ArrayList<>();
        eyecolorList.add("gray");
        eyecolorList.add("blue");
        eyecolorList.add("green");
        eyecolorList.add("brown");
        eyecolorList.add("milky");
        modelAndView.addObject("eyecolorList", eyecolorList);

        List<String> figureList = new ArrayList<>();
        figureList.add("thin");
        figureList.add("sporty");
        figureList.add("normal");
        figureList.add("chubby");
        figureList.add("fat");
        modelAndView.addObject("figureList", figureList);

        return modelAndView;
    }

    @RequestMapping(value = "/girlfriend", method = RequestMethod.POST)
    public ModelAndView zpracujGirlfriend() {
        ModelAndView modelAndView = new ModelAndView("result");

        int result = girlfriendService.camelsForAge() +
                girlfriendService.camelsForHeight() +
                girlfriendService.camelsForHaircolor() +
                girlfriendService.camelsForEyecolor() +
                girlfriendService.camelsForFigure();

        modelAndView.addObject("result", result);

        return modelAndView;
    }

    @RequestMapping(value = "/boyfriend", method = RequestMethod.GET)
    public ModelAndView zobrazBoyfriend() {
        ModelAndView modelAndView = new ModelAndView("boyfriend");

        boyfriendForm = new BoyfriendForm();

        List<Integer> ageList = new ArrayList<>();
        for (int i = 16; i < 101; i++) {
            ageList.add(i);
        }
        modelAndView.addObject("ageList", ageList);

        List<Integer> heightList = new ArrayList<>();
        for (int j = 140; j < 221; j++) {
            heightList.add(j);
        }
        modelAndView.addObject("heightList", heightList);

        List<String> haircolorList = new ArrayList<>();
        haircolorList.add("blonde");
        haircolorList.add("ginger");
        haircolorList.add("brown");
        haircolorList.add("black");
        haircolorList.add("gray");
        modelAndView.addObject("haircolorList", haircolorList);

        List<String> eyecolorList = new ArrayList<>();
        eyecolorList.add("gray");
        eyecolorList.add("blue");
        eyecolorList.add("green");
        eyecolorList.add("brown");
        eyecolorList.add("milky");
        modelAndView.addObject("eyecolorList", eyecolorList);

        List<String> figureList = new ArrayList<>();
        figureList.add("thin");
        figureList.add("sporty");
        figureList.add("normal");
        figureList.add("chubby");
        figureList.add("fat");
        modelAndView.addObject("figureList", figureList);

        return modelAndView;
    }

    @RequestMapping(value = "/boyfriend", method = RequestMethod.POST)
    public ModelAndView zpracujBoyfriend() {
        ModelAndView modelAndView = new ModelAndView("result");

        int result = boyfriendService.camelsForAge() +
                boyfriendService.camelsForHeight() +
                boyfriendService.camelsForHaircolor() +
                boyfriendService.camelsForEyecolor() +
                boyfriendService.camelsForFigure();

        modelAndView.addObject("result", result);

        return modelAndView;
    }

}
