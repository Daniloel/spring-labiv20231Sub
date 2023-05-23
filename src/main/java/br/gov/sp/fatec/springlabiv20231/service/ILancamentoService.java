package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import br.gov.sp.fatec.springlabiv20231.entity.Lancamento;

public interface ILancamentoService {

    public List<Lancamento> buscarTodos();

    public Lancamento novo(Lancamento lancamento);
    
}
