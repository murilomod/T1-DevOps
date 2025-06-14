
package com.devops.musica.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OrdenacaoController.class)
public class OrdenacaoTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void deveOrdenarNumeros() throws Exception {
        mvc.perform(get("/ordenar").param("valores", "5,2,3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2,3,5"));
    }
}
