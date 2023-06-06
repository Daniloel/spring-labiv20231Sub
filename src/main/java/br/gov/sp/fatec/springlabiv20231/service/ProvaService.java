package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springlabiv20231.entity.Prova;
import br.gov.sp.fatec.springlabiv20231.repository.ProvaRepository;

@Service
public class ProvaService implements IProvaService{

    @Autowired
    private ProvaRepository provaRepo;

    public List<Prova> todasProvas() {
        return provaRepo.findAll();
    }

    public Prova novaProva(Prova prova) {
        return provaRepo.save(prova);
    }
    
}
