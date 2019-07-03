package guru.springframework.springrecipe.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    //everytime we get ingredient we get the unitofmeasure
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    //private UnitOfMeasure uom;
    //no cascade here, because if we want to delete an ingredient we dont want to delete a recipe!
    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}