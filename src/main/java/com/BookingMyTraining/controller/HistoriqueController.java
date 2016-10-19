package com.BookingMyTraining.controller;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BookingMyTraining.domain.Historique;
import com.BookingMyTraining.services.HistoriqueService;

@RestController
@RequestMapping("/historique")
public class HistoriqueController {

	@Resource
	private HistoriqueService historiqueService;

	@Autowired
	public void setHistoriqueService(HistoriqueService historiqueService) {
		this.historiqueService = historiqueService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Historique> getAllHistoriques() {
		return this.historiqueService.listAllHistoriques();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Historique getHistoriqueById(@PathVariable(value = "idHistorique") int idHistorique) {
		// find Historique by Id
		return this.historiqueService.getHistoriqueById(idHistorique);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Historique updateHistorique(@PathVariable(value = "id") int id, @RequestBody Historique historique) {
		historique.setIdHistorique(id);
		return this.historiqueService.updateHistorique(historique);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteHistorique(@PathVariable(value = "id") int id) {
		this.historiqueService.deleteHistorique(id);
	}

	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public void deleteHistoriques() {
		this.historiqueService.deleteHistoriques();
	}

	public HistoriqueService getHistoriqueService() {
		return historiqueService;
	}

}
