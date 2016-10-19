package com.BookingMyTraining.services.impl;

import java.util.Collection;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingMyTraining.domain.Entreprise;
import com.BookingMyTraining.repositories.EntrepriseRepository;
import com.BookingMyTraining.services.EntrepriseService;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

	private EntrepriseRepository entrepriseRepository;

	@Autowired
	public void setEntrepriseRepository(EntrepriseRepository EntrepriseRepository) {
		this.entrepriseRepository = EntrepriseRepository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Entreprise> listAllEntreprises() {
		return IteratorUtils.toList(this.entrepriseRepository.findAll().iterator());
	}

	@Override
	public Entreprise getEntrepriseById(Integer id) {
		return this.entrepriseRepository.findOne(id);
	}

	@Override
	public Entreprise updateEntreprise(Entreprise Entreprise) {
		return this.entrepriseRepository.save(Entreprise);
	}

	@Override
	public void deleteEntreprise(int id) {
		this.entrepriseRepository.delete(id);
	}

	@Override
	public void deleteEntreprises() {
		this.entrepriseRepository.deleteAll();
	}

}
