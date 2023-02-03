package spring.data.entity.person;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Person extends AbstractPersistable<UUID> {

    private String name;
    private String lastName;

}
