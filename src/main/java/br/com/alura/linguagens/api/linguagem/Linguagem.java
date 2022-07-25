package br.com.alura.linguagens.api.linguagem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Getter
@Document(collection = "principaisLinguagens")
public class Linguagem {
	
		
	@Id
	private String id;
	
	private String title;
	
	private String image;
	
	private int ranking;
	
	public Linguagem(String title, String image, int ranking) {
		super();
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	
	

}
