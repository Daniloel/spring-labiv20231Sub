package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import br.gov.sp.fatec.springlabiv20231.entity.Prova;

public interface IProvaService {

    public List<Prova> todasProvas();

    public Prova novaProva(Prova prova);
      
}
