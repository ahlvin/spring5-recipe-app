package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by vineet  on 2/26/2021.
 */
//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
//    @DirtiesContext
    void findByDescription() {
        Optional<UnitOfMeasure> uomOptional =  unitOfMeasureRepository.findByDescription("Teaspoon");

        assertTrue(uomOptional.isPresent());
        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }
}