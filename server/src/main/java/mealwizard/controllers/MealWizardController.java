package mealwizard.controllers;

import mealwizard.domain.Ingredient;
import mealwizard.domain.Meal;
import mealwizard.repositories.IngredientRepository;
import mealwizard.repositories.MealRepository;
import mealwizard.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MealWizardController {

    @Autowired
    private MealService mealService;
    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private MealRepository mealRepository;

//    @Autowired
//    public MealWizardController(IngredientRepository ingredientRepository,
//                                MealRepository mealRepository) {
//        this.ingredientRepository = ingredientRepository;
//        this.mealRepository = mealRepository;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        mealService.storeStuff();
        List<Meal> meals = (List<Meal>) mealRepository.findAll();
        meals.parallelStream().forEach(System.out::println);

        List<Ingredient> ingredients = ingredientRepository.findByName("Fish");

        ingredients.forEach((ingredient) -> System.out.println
                ("ingredient = " + ingredient));
        System.out.println("-------");
        meals.get(0).getIngredients().forEach((ingredient) -> System.out.println
                ("ingredient = " + ingredient));

        modelMap.addAttribute("title", "Test why this works");
        return "index";
    }

}
