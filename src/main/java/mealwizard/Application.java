package mealwizard;


import mealwizard.domain.Ingredient;
import mealwizard.repositories.IngredientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.*;
import java.util.Date;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {

//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
//        IngredientRepository ingredientRepository = context.getBean
//                (IngredientRepository.class);
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime newTime = time.plus(Period.ofDays(2));
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        IngredientRepository ingredientRepository = context.getBean(IngredientRepository.class);
//        Instant instant = newTime.atZone(ZoneId.systemDefault());
        ingredientRepository.save(new Ingredient("Fish",new Date()));// Date.from(instant))));
    }
}