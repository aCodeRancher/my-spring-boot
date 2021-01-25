package guru.springframework.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class ShippingAddressControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getShippingAddressTest() throws Exception{
      mockMvc.perform(get("/shippingAddress"))
            .andExpect(jsonPath("$.street-address").value("100 N Street"))
              .andExpect(jsonPath("$.postal-code").value("22201"))
              .andExpect(jsonPath("$.country-name").value("US"));
   }
}