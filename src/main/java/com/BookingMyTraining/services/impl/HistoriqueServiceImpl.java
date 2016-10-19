package com.BookingMyTraining.services.impl;

import java.util.Collection;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingMyTraining.domain.Historique;
import com.BookingMyTraining.repositories.HistoriqueRepository;
import com.BookingMyTraining.services.HistoriqueService;

@Service
public class HistoriqueServiceImpl implements HistoriqueService {

	private HistoriqueRepository historiqueRepository;

	@Autowired
	public void setHistoriqueRepository(HistoriqueRepository HistoriqueRepository) {
		this.historiqueRepository = HistoriqueRepository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Historique> listAllHistoriques() {
		return IteratorUtils.toList(this.historiqueRepository.findAll().iterator());
	}

	@Override
	public Historique getHistoriqueById(Integer id) {
		return this.historiqueRepository.findOne(id);
	}

	@Override
	public Historique updateHistorique(Historique Historique) {
		return this.historiqueRepository.save(Historique);
	}

	@Override
	public void deleteHistorique(int id) {
		this.historiqueRepository.delete(id);
	}

	@Override
	public void deleteHistoriques() {
		this.historiqueRepository.deleteAll();
	}

}
