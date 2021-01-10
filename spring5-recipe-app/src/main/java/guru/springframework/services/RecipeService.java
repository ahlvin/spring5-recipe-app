package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by vineet  on 1/10/2021.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
