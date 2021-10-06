package com.alex.ifoodbackend.restaurant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.ifoodbackend.pratos.Prato;
import com.alex.ifoodbackend.pratos.PratoRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {

	private final RestauranteRepository restauranteRepository;
	private final PratoRepository pratoRepository;
	
	public RestauranteController(RestauranteRepository restauranteRepository, PratoRepository pratoRepository) {
		super();
		this.restauranteRepository = restauranteRepository;
		this.pratoRepository = pratoRepository;
	}

	@GetMapping("/retornaTodos")
	List<Restaurante> todosRestaurantes() {
		return restauranteRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	Optional<Restaurante> retornaRestaurante(@PathVariable Long id) {
		return restauranteRepository.findById(id);
	}
	
	@GetMapping("/{id}/pratos")
	List<Prato> retornaPratosDoRestaurante(@PathVariable Long id) {
		return pratoRepository.findAllByRestauranteId(id);
	}
	
	@PostMapping("/novo")
	Restaurante novoRestaurante(@RequestBody Restaurante restaurante) {
		return restauranteRepository.save(restaurante);
	}
	
	@PutMapping("/{id}")
	Restaurante atualiza(@RequestBody Restaurante restaurante, @PathVariable Long id) {
		restaurante.setId(id);
		return restauranteRepository.save(restaurante);
	}
	
	@DeleteMapping("/deleta/{id}")
	void deletaRestaurante(@PathVariable Long id) {
		restauranteRepository.deleteById(id);
	}
}
