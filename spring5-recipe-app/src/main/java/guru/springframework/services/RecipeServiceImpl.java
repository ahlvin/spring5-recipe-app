package guru.springframework.services;

import guru.springframework.bootstrap.RecipeBootstrap;
import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vineet  on 1/10/2021.
 */
@Service
public class RecipeServiceImpl implements  RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipesSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipesSet:: add);
        return recipesSet;
    }
}