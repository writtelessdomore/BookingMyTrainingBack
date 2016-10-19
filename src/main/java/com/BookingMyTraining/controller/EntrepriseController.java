package com.BookingMyTraining.controller;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BookingMyTraining.domain.Entreprise;
import com.BookingMyTraining.services.EntrepriseService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {

	@Resource
	private EntrepriseService entrepriseService;

	@Autowired
	public void setEntrepriseService(EntrepriseService EntrepriseService) {
		this.entrepriseService = EntrepriseService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Entreprise> getAllEntreprises() {
		return this.entrepriseService.listAllEntreprises();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Entreprise getEntrepriseById(@PathVariable(value = "idEntreprise") int idEntreprise) {
		// find Entreprise by Id
		return this.entrepriseService.getEntrepriseById(idEntreprise);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Entreprise updateEntreprise(@PathVariable(value = "id") int id, @RequestBody Entreprise Entreprise) {
		Entreprise.setIdEntreprise(id);
		return this.entrepriseService.updateEntreprise(Entreprise);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEntreprise(@PathVariable(value = "id") int id) {
		this.entrepriseService.deleteEntreprise(id);
	}

	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public void deleteEntreprises() {
		this.entrepriseService.deleteEntreprises();
	}

	public EntrepriseService getEntrepriseService() {
		return entrepriseService;
	}

}
