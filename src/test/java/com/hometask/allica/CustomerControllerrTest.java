package com.hometask.allica;

import com.hometask.allica.controller.CustomerController;
import com.hometask.allica.repository.CustomerRepository;
import com.hometask.allica.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CustomerController.class)
public class CustomerControllerrTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerRepository customerRepository;

    @MockBean
    private CustomerService customerService;

    @Test
    public void shouldRespondeCustomer() throws Exception {
        mockMvc.perform(get("/customer/1"))
                .andExpect(status().is2xxSuccessful());
    }
    @Test
    public void shouldRespondeAllCustomer() throws Exception {
        mockMvc.perform(get("/customer?page=0&size=3"))
                .andExpect(status().is2xxSuccessful());
    }
}
