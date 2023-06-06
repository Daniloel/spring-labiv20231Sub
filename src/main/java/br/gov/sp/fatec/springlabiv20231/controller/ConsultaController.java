package br.gov.sp.fatec.springlabiv20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springlabiv20231.entity.Consulta;
import br.gov.sp.fatec.springlabiv20231.service.IConsultaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/consulta")
public class ConsultaController {

    @Autowired
    private IConsultaService service;

    @GetMapping
    public List<Consulta> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Consulta novo(@RequestBody Consulta consulta) {
        return service.novo(consulta);
    }

}
