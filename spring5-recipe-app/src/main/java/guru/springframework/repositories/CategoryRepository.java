package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by vineet  on 1/3/2021.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
