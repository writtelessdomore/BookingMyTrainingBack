package com.BookingMyTraining.services;

import java.util.Collection;

import com.BookingMyTraining.domain.Stagiaire;

public interface StagiaireService {

	Collection<Stagiaire> listAllStagiaires();

	Stagiaire getStagiaireById(Integer id);

	Stagiaire updateStagiaire(Stagiaire stagiaire);

	void deleteStagiaire(int id);

	void deleteStagiaires();

}
