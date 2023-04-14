package com.easypets.dao;

import org.springframework.stereotype.Repository;
import com.easypets.domain.Pet;

@Repository
public class PetDaoImpl extends AbstractDao<Pet, Long> implements PetDao{

}
