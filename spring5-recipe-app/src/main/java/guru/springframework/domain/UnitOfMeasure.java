package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by vineet  on 1/3/2021.
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;


}
