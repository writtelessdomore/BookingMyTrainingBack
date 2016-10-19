package com.BookingMyTraining.services;

import java.util.Collection;

import com.BookingMyTraining.domain.Entreprise;

public interface EntrepriseService {

	Collection<Entreprise> listAllEntreprises();

	Entreprise getEntrepriseById(Integer id);

	Entreprise updateEntreprise(Entreprise Entreprise);

	void deleteEntreprise(int id);

	void deleteEntreprises();

}
