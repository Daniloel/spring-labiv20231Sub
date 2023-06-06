package br.gov.sp.fatec.springlabiv20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prv_prova")
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prv_id")
    private Long id;

    @Column(name = "prv_descricao")
    private String descricao;

    @Column(name = "prv_data_hora_inicio")
    private LocalDateTime dataHoraInicio;

    @Column(name = "prv_nota")
    private Float nota;

    public Prova() {}

    public Prova(String descricao, LocalDateTime dataHoraInicio, Float nota) {
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.nota = nota;
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

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

}
