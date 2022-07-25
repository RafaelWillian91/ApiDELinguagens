package br.com.alura.linguagens.api.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import br.com.alura.linguagens.api.linguagem.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{
	
	

}
