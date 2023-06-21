package br.gov.sp.fatec.springlabiv20231.service;

import java.sql.Date;
import java.util.List;

import br.gov.sp.fatec.springlabiv20231.entity.Usuario;

public interface IUsuarioService {

    public List<Usuario> buscarTodos();

    public Usuario buscarPorId(Long id);
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuarioAutorizacao(String nome, String senha, Date data, String nomeAutorizacao);
}
