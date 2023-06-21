package br.gov.sp.fatec.springlabiv20231.entity;




import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "usr_usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_senha")
    private String senha;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "usr_data_admissao")
    private Date data;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
  
    private List<Anotacao> anotacoes;

    @ManyToMany
    @JoinTable(name = "uau_usuario_autorizacao",
        joinColumns = {@JoinColumn(name = "usr_id")},
        inverseJoinColumns = {@JoinColumn(name = "aut_id")})
   
    private List<Autorizacao> autorizacoes;

    

   

    public Usuario(String nome, String senha, Date data) {
        this.nome = nome;
        this.senha = senha;
        this.data = data;
    }



    public Usuario() {
        // Faz nada
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public List<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    public void setAutorizacoes(List<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }  

}
