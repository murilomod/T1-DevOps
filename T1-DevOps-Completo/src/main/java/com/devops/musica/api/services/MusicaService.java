
package com.devops.musica.api.services;

import com.devops.musica.api.model.Musica;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {

    public Musica cadastrarMusica(String nome) {
        Musica m = new Musica();
        m.setNome(nome);
        return m;
    }
}
