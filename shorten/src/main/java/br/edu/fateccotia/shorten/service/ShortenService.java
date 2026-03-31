package br.edu.fateccotia.shorten.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.shorten.entity.Shorten;
import br.edu.fateccotia.shorten.repository.ShortenRepository;

@Service
public class ShortenService {
	@Autowired
	private ShortenRepository repository;
	
	public Shorten Create(String url) {
		String key = generateKey();
		Shorten s = new Shorten();
		s.setUrl(url);
		s.setKey(key);
		return repository.save(s);
	}

	private String generateKey() {
		String key = "";
		List<String> letras = new ArrayList<>();
		letras.addAll(List.of("a","b","c","d","A","B","C","D"));
		for (int i = 0; i <= 6; i++) {
			key += letras.get(new Random().nextInt(letras.size()));
		}
		return key;
	}
	
	public String findByKey(String key) {
		Optional<Shorten> found = repository.findByKey(key);
		if (found.isPresent()) {
			return found.get().getUrl();
		}
		return null;
	}
}
