package guru.springframework.springrecipe.services;

import guru.springframework.springrecipe.commands.RecipeCommand;
import guru.springframework.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);

}
