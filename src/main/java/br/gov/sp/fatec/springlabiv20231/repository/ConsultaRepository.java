package br.gov.sp.fatec.springlabiv20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlabiv20231.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
