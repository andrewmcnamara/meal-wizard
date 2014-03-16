package mealwizard.services;

import mealwizard.domain.Ingredient;
import mealwizard.domain.Meal;
import mealwizard.repositories.IngredientRepository;
import mealwizard.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by andrew on 10/03/2014.
 */
@Component
public class MealServiceImpl implements MealService {
    @Autowired
    MealRepository mealRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    @Transactional
    public void storeStuff() {
//        IngredientRepository ingredientRepository = context.getBean(IngredientRepository.class);
//        MealRepository mealRepository = context.getBean(MealRepository.class);
        Ingredient ingredient1 = new Ingredient("Fish", new Date(), null);
        Ingredient ingredient2 = new Ingredient("Cheese", new Date(), null);
        Meal meal = new Meal();
        meal.setName("Cheesy fish");
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        meal.setIngredients(ingredients);
        mealRepository.save(meal);

        Meal meal2 = new Meal();
        meal2.setName("Fish pizza");
        meal2.setIngredients(ingredients);
        mealRepository.save(meal2);

    }
}
