package mealwizard.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ingredient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    final private String name;
    final private Date useBy;

    protected Ingredient() {
        this(null, null);
    }

    public Ingredient(String name, Date useBy) {
        this.name = name;
        this.useBy = useBy;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
