package br.com.alura.linguagens.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.alura.linguagens.api.Repository.LinguagemRepository;
import br.com.alura.linguagens.api.linguagem.Linguagem;

@RestController
public class LinguagemController {
	
	@Autowired
	private LinguagemRepository repository;
	
	@GetMapping(value="/linguagens")
	public List<Linguagem> retornList(){
		List<Linguagem> linguagens = repository.findAll();
		return linguagens;
	}
	
	
	@PostMapping(value="/linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
		Linguagem linguagemSalva = repository.save(linguagem);
		return linguagemSalva;
	}
	
	
	

}
