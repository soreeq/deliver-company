package com.d3vshub.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OpenApiCustomersRequestTest {

    private static final String CUSTOMERS_PATH = "/api/customers";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenLoadCustomersStatusIsNotImplemented() throws Exception {
        this.mockMvc.perform(get(CUSTOMERS_PATH)).andExpect(status().isNotImplemented());
    }
}
