package org.example.delivery;

import jakarta.persistence.EntityManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CustomerEntityRepositoryTest {

    @Autowired private CustomerRepository customerRepository;

/*    @Test
    void injectedComponentsAreNotNull(){
        assertThat(customerRepository).isNotNull();
    }*/
}