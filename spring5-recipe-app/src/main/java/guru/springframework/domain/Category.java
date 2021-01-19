package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by vineet  on 1/3/2021.
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;

    @ManyToMany(mappedBy ="categories" )
    private Set<Recipe> recipe;


}
