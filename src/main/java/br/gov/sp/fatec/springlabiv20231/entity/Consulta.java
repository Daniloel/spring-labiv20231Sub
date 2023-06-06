package br.gov.sp.fatec.springlabiv20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cns_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cns_id")
    @JsonIgnore
    private Long id;

    @Column(name = "cns_descricao")
    private String descricao;

    @Column(name = "cns_data_hora")
    private LocalDateTime dataHoraInicio;

    @Column(name = "cns_duracao")
    private Integer duracao;

    public Consulta() {}

    public Consulta(String descricao, LocalDateTime dataHoraInicio, Integer duracao) {
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.duracao = duracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    
    
}
