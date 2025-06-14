
package com.devops.musica.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrdenacaoController {

    @GetMapping("/ordenar")
    public String ordenar(@RequestParam String valores) {
        List<Integer> numeros = Arrays.stream(valores.split(","))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        return numeros.stream().map(String::valueOf).collect(Collectors.joining(","));
    }
}
