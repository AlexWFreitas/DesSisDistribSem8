package com.alex.ifoodbackend.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/restaurantes")
@RequiredArgsConstructor(onConstructor_=@Autowired)
public class RestauranteController {

	private final RestauranteRepository restauranteRepository;
	
	@GetMapping("/retornaTodos")
	List<Restaurante> todosRestaurantes() {
		return restauranteRepository.findAll();
	}
	
	@PostMapping("/novo")
	Restaurante novoRestaurante(@RequestBody Restaurante restaurante) {
		return restauranteRepository.save(restaurante);
	}

}
