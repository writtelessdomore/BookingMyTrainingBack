package com.BookingMyTraining.controller;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BookingMyTraining.domain.Stage;
import com.BookingMyTraining.services.StageService;

@RestController
@RequestMapping("/stage")
public class StageController {

	@Resource
	private StageService stageService;

	@Autowired
	public void setStageService(StageService StageService) {
		this.stageService = StageService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Stage> getAllStages() {
		return this.stageService.listAllStages();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Stage getStageById(@PathVariable(value = "idStage") int idStage) {
		// find Stage by Id
		return this.stageService.getStageById(idStage);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Stage updateStage(@PathVariable(value = "id") int id, @RequestBody Stage stage) {
		stage.setIdStage(id);
		return this.stageService.updateStage(stage);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStage(@PathVariable(value = "id") int id) {
		this.stageService.deleteStage(id);
	}

	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public void deleteStages() {
		this.stageService.deleteStages();
	}

	public StageService getStageService() {
		return stageService;
	}

}
