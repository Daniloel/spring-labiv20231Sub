package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import br.gov.sp.fatec.springlabiv20231.entity.Consulta;

public interface IConsultaService {
    
    public List<Consulta> buscarTodos();

    public Consulta novo(Consulta consulta);
}
