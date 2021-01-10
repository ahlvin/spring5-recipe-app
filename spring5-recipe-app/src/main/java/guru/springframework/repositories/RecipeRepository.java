package guru.springframework.repositories;

import guru.springframework.domain.Category;
import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by vineet  on 1/3/2021.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
//    @Override
//    <S extends Recipe> Iterable<S> saveAll(Iterable<S> iterable);
}
