package spring.data.entity.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { })
@ActiveProfiles("entity-person")
@AutoConfigureMockMvc
public class PersonTest {

    @Autowired
    private PersonRepository repository;


    @Test
    @Sql( scripts = {"classpath:entity.sql"})
    public void methodTest() {

        // Arrange
        List<Person> result = repository.findAll();

        // Act

        // Assert

    }

}
