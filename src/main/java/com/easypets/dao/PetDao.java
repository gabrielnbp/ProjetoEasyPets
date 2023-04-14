package com.easypets.dao;

import java.util.List;

import com.easypets.domain.*;

public interface PetDao {
	void save(Pet pet);
	void update(Pet pet);
	void delete(Long id);
	Pet findById(Long id);
	List<Pet> findAll();
}
