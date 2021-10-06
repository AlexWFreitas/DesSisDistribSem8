package com.alex.ifoodbackend.pratos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato, Long> {
	
	List<Prato> findAllByRestauranteId(Long id);

}
