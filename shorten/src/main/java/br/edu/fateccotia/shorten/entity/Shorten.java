package br.edu.fateccotia.shorten.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shortens")
public class Shorten {
	//Attributes/Fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String url;
	private String key;
	
	public Shorten() {
	}
	
	//Constructors
	public Shorten(Integer id, String url, String key) {
		super();
		this.id = id;
		this.url = url;
		this.key = key;
	}
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
