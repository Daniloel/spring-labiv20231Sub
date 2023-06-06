package br.gov.sp.fatec.springlabiv20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springlabiv20231.entity.Prova;
import br.gov.sp.fatec.springlabiv20231.service.ProvaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/prova")
public class ProvaController {

    @Autowired
    private ProvaService service;

    @GetMapping
    public List<Prova> todas() {
        return service.todasProvas();
    }

    @PostMapping
    public Prova nova(@RequestBody Prova prova) {
        return service.novaProva(prova);
    }
    
}
