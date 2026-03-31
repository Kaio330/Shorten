package br.edu.fateccotia.shorten.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateccotia.shorten.entity.Shorten;
import br.edu.fateccotia.shorten.service.ShortenService;



@RestController
@RequestMapping("/short")
public class ShortenController {
	@Autowired
	private ShortenService service;
	
	
	@PostMapping
	public ResponseEntity<Shorten> create(@RequestBody String url){
		return ResponseEntity.ok(service.Create(url));
	}
	
	@GetMapping("/{key}")
	public ResponseEntity<?> redirect(@PathVariable String key){
		String url = service.findByKey(key);
		return ResponseEntity.status(HttpStatus.FOUND).header("Location", url).build();
	}
		
}
