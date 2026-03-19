package br.edu.fateccotia.isw029.imc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateccotia.isw029.imc.entity.Imc;
import br.edu.fateccotia.isw029.imc.service.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcControler {
	@Autowired
	private ImcService imcService;
	
	@PostMapping
	public ResponseEntity<Imc> calculateImc(@RequestBody Map<String, Double> data) {
		Double p = data.get("peso");
		Double a = data.get("altura");
		
		Imc i = imcService.calculate(p,a);
		return ResponseEntity.ok(i);
		
		
	}
}
