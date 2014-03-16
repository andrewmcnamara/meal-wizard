package mealwizard;


import mealwizard.domain.Ingredient;
import mealwizard.domain.Meal;
import mealwizard.repositories.IngredientRepository;
import mealwizard.repositories.MealRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.transaction.Transactional;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

    @Transactional
    public static void main(String[] args) {

//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
//        IngredientRepository ingredientRepository = context.getBean
//                (IngredientRepository.class);
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime newTime = time.plus(Period.ofDays(2));
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//        Instant instant = newTime.atZone(ZoneId.systemDefault());
//        ingredientRepository.save();// Date.from(instant))));
    }
}