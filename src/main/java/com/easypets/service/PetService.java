package com.easypets.service;

import java.util.List;

import com.easypets.domain.Pet;

public interface PetService {
	void salvar(Pet pet);
	Pet buscarPorId(Long id);
	List<Pet> buscarTodos();
}
