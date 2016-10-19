package com.BookingMyTraining.controller;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BookingMyTraining.domain.Stagiaire;
import com.BookingMyTraining.services.StagiaireService;

@RestController
@RequestMapping("/stagiaire")
public class StagiaireController {

	@Resource
	private StagiaireService stagiaireService;

	@Autowired
	public void setStagiaireService(StagiaireService StagiaireService) {
		this.stagiaireService = StagiaireService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Stagiaire> getAllStagiaires() {
		return this.stagiaireService.listAllStagiaires();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Stagiaire getStagiaireById(@PathVariable(value = "idStagiaire") int idStagiaire) {
		// find Stagiaire by Id
		return this.stagiaireService.getStagiaireById(idStagiaire);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Stagiaire updateStagiaire(@PathVariable(value = "id") int id, @RequestBody Stagiaire Stagiaire) {
		Stagiaire.setId(id);

		return this.stagiaireService.updateStagiaire(Stagiaire);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStagiaire(@PathVariable(value = "id") int id) {
		this.stagiaireService.deleteStagiaire(id);
	}
	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public void deleteStagiaires() {
		this.stagiaireService.deleteStagiaires();
	}

	public StagiaireService getStagiaireService() {
		return stagiaireService;
	}

}
