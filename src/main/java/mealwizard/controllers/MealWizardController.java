package mealwizard.controllers;

import mealwizard.domain.Ingredient;
import mealwizard.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MealWizardController {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public MealWizardController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        List<Ingredient> ingredients = ingredientRepository.findByName("Fish");
        ingredients.forEach((Ingredient ingredient)-> System.out.println
                ("ingredient = " + ingredient));
        return "index";
    }

}
