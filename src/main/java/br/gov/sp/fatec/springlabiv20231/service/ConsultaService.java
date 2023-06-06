package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springlabiv20231.entity.Consulta;
import br.gov.sp.fatec.springlabiv20231.repository.ConsultaRepository;

@Service
public class ConsultaService implements IConsultaService{
    
    @Autowired
    private ConsultaRepository consultaRepo;

    public List<Consulta> buscarTodos() {
        return consultaRepo.findAll();
    }

    public Consulta novo(Consulta consulta) {
        return consultaRepo.save(consulta);
    }
}
