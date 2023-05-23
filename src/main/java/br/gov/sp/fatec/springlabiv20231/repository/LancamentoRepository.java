package br.gov.sp.fatec.springlabiv20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlabiv20231.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
    
}
