package com.alex.ifoodbackend.pratos;

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

@RestController
@RequestMapping("/api/pratos")
public class PratoController {

	private final PratoRepository pratoRepository;
	
	public PratoController(PratoRepository pratoRepository) {
		super();
		this.pratoRepository = pratoRepository;
	}

	@GetMapping("/retornaTodos")
	List<Prato> todosPratos() {
		return pratoRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	Optional<Prato> retornaRestaurante(@PathVariable Long id) {
		return pratoRepository.findById(id);
	}
	
	@PostMapping("/novo")
	Prato novoPrato(@RequestBody Prato prato) {
		return pratoRepository.save(prato);
	}
	
	@PutMapping("/{id}")
	Prato atualiza(@RequestBody Prato prato, @PathVariable Long id) {
		prato.setId(id);
		return pratoRepository.save(prato);
	}
	
	@DeleteMapping("/deleta/{id}")
	void deletaRestaurante(@PathVariable Long id) {
		pratoRepository.deleteById(id);
	}
}
