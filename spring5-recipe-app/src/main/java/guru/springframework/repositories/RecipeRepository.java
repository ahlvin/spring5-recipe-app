package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vineet  on 1/3/2021.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
