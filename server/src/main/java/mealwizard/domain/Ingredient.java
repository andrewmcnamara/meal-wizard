package mealwizard.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

@Entity
public class Ingredient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private Date useBy;

    @ManyToOne(targetEntity = Meal.class)
    private List<Meal> meals;

    protected Ingredient() {
        this(null, null, null);
    }

    public Ingredient(String name, Date useBy, List<Meal> meals) {
        this.name = name;
        this.useBy = useBy;
        this.meals = meals;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("name->" + name);
        sj.add("useBy->" + useBy);
        return sj.toString();
    }
}
