package mealwizard.domain;

import javax.persistence.*;
import java.util.List;
import java.util.StringJoiner;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;
    @OneToMany(mappedBy = "meals", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("name->"+name);
        return sj.toString();
    }
}
