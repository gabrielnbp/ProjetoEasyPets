package com.easypets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.easypets.dao.PetDao;
import com.easypets.domain.Pet;

@Service
public class PetServiceImpl implements PetService{
	
	@Autowired
	private PetDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Pet pet) {
		dao.save(pet);

	}

	@Transactional(readOnly = false)
	@Override
	public Pet buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = false)
	public List<Pet> buscarTodos() {
		return dao.findAll();
	}
}
