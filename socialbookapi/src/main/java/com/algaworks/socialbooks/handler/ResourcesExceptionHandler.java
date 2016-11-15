package com.algaworks.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.algaworks.socialbooks.domain.DetalhesErro;
import com.algaworks.socialbooks.services.exceptions.AutorExistenteException;
import com.algaworks.socialbooks.services.exceptions.AutorNaoEncontradoException;
import com.algaworks.socialbooks.services.exceptions.LivroNaoEncontradoException;

@ControllerAdvice
public class ResourcesExceptionHandler {
	
	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handlerLivroNaoEncontradoException(LivroNaoEncontradoException e, HttpServletRequest resquest){
		
		DetalhesErro detalhesErro = new DetalhesErro();
		
		detalhesErro.setStatus(404l);
		detalhesErro.setTitulo("O livro não pode ser encontrado");
		detalhesErro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
		detalhesErro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(detalhesErro);
	}
	
	@ExceptionHandler(AutorExistenteException.class)
	public ResponseEntity<DetalhesErro> handlerAutorExistenteException(AutorExistenteException e, HttpServletRequest request){
		DetalhesErro detalhesErro = new DetalhesErro();
		
		detalhesErro.setStatus(409l);
		detalhesErro.setTitulo("O autor já existe.");
		detalhesErro.setMensagemDesenvolvedor("http://erros.socialbooks.com/409");
		detalhesErro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(detalhesErro);
		
	}
	
	@ExceptionHandler(AutorNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handlerAutorNaoEncontradoException(AutorNaoEncontradoException e, HttpServletRequest request){
		DetalhesErro detalhesErro = new DetalhesErro();
		
		detalhesErro.setStatus(404l);
		detalhesErro.setTitulo("O autor não pode ser encontrato.");
		detalhesErro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
		detalhesErro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(detalhesErro);
		
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErro> handlerDataIntegrityViolationException(DataIntegrityViolationException e, HttpServletRequest request){
		DetalhesErro detalhesErro = new DetalhesErro();
		
		detalhesErro.setStatus(400l);
		detalhesErro.setTitulo("Requisição inválida.");
		detalhesErro.setMensagemDesenvolvedor("http://erros.socialbooks.com/400");
		detalhesErro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(detalhesErro);
		
	}
}
