package br.edu.fateccotia.shorten.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import br.edu.fateccotia.shorten.entity.Shorten;

public interface ShortenRepository extends CrudRepository<Shorten, Integer>{
		Optional<Shorten> findByKey(String key);
}
