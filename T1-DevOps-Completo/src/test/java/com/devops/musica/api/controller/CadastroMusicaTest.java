
package com.devops.musica.api.controller;

import com.devops.musica.api.model.Musica;
import com.devops.musica.api.services.MusicaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MusicaController.class)
public class CadastroMusicaTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MusicaService musicaService;

    @Test
    public void deveCadastrarMusica() throws Exception {
        Musica musica = new Musica();
        musica.setNome("Imagine");

        Mockito.when(musicaService.cadastrarMusica(anyString())).thenReturn(musica);

        mvc.perform(post("/musicas").param("nome", "Imagine"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Imagine"));
    }
}
