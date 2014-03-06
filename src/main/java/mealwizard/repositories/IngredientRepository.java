package mealwizard.repositories;

import mealwizard.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    List<Ingredient> findByName(String name);
}

