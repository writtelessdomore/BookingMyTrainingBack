package com.BookingMyTraining.services.impl;

import java.util.Collection;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingMyTraining.domain.Stagiaire;
import com.BookingMyTraining.repositories.StagiaireRepository;
import com.BookingMyTraining.services.StagiaireService;

@Service
public class StagiaireServiceImpl implements StagiaireService {

	private StagiaireRepository stagiaireRepository;

	@Autowired
	public void setStagiaireRepository(StagiaireRepository StagiaireRepository) {
		this.stagiaireRepository = StagiaireRepository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Stagiaire> listAllStagiaires() {
		return IteratorUtils.toList(this.stagiaireRepository.findAll().iterator());
	}

	@Override
	public Stagiaire getStagiaireById(Integer id) {
		return this.stagiaireRepository.findOne(id);
	}

	@Override
	public Stagiaire updateStagiaire(Stagiaire Stagiaire) {
		return this.stagiaireRepository.save(Stagiaire);
	}

	@Override
	public void deleteStagiaire(int id) {
		this.stagiaireRepository.delete(id);
	}

	@Override
	public void deleteStagiaires() {
		this.stagiaireRepository.deleteAll();
	}

}
