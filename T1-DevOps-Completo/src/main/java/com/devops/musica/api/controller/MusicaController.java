
package com.devops.musica.api.controller;

import com.devops.musica.api.model.Musica;
import com.devops.musica.api.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping
    public ResponseEntity<Musica> cadastrarMusica(@RequestParam String nome) {
        Musica musica = musicaService.cadastrarMusica(nome);
        return ResponseEntity.ok(musica);
    }
}
