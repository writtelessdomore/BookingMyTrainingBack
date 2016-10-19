package com.BookingMyTraining.services;

import java.util.Collection;

import com.BookingMyTraining.domain.Historique;

public interface HistoriqueService {

	Collection<Historique> listAllHistoriques();

	Historique getHistoriqueById(Integer id);

	Historique updateHistorique(Historique Historique);

	void deleteHistorique(int id);

	void deleteHistoriques();

}
