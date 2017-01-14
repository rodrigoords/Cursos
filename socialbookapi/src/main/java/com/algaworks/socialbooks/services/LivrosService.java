package com.algaworks.socialbooks.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.socialbooks.domain.Comentario;
import com.algaworks.socialbooks.domain.Livro;
import com.algaworks.socialbooks.repository.ComentarioRepository;
import com.algaworks.socialbooks.repository.LivrosRepository;
import com.algaworks.socialbooks.services.exceptions.LivroNaoEncontradoException;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	public List<Livro> listar(){
		return livrosRepository.findAll();
	}
	
	public Livro buscar(Long id){
		Livro livro = livrosRepository.findOne(id);
		
		if(livro == null){
			throw new LivroNaoEncontradoException("O Livro não foi encontrado");
		}
		
		return livro;
	}
	
	public Livro salvar(Livro livro){
		
		livro.setId(null);
		return livrosRepository.save(livro);
	}
	
	public void deletar(Long id){
		try{
			livrosRepository.delete(id);
		}catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("O Livro não foi encontrado");
		}
	}
	
	public void atualizar(Livro livro){
		this.verificaExistencia(livro);
		livrosRepository.save(livro);
	}
	
	public Comentario salvarComentario(Long livroId, Comentario comentario){
		Livro livro = this.buscar(livroId);
		
		comentario.setLivro(livro);
		comentario.setData(new Date());
		
		return comentarioRepository.save(comentario);
	}
	
	public List<Comentario> listarComentarios(Long livroId){
		Livro livro = this.buscar(livroId);
		
		return livro.getComentarios();
	}
	
	private void verificaExistencia(Livro livro){
		this.buscar(livro.getId());
	}
	
}
