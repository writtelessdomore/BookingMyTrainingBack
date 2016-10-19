package com.BookingMyTraining.services.impl;

import java.util.Collection;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingMyTraining.domain.Stage;
import com.BookingMyTraining.repositories.StageRepository;
import com.BookingMyTraining.services.StageService;

@Service
public class StageServiceImpl implements StageService {

	private StageRepository stageRepository;

	@Autowired
	public void setStageRepository(StageRepository StageRepository) {
		this.stageRepository = StageRepository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Stage> listAllStages() {
		return IteratorUtils.toList(this.stageRepository.findAll().iterator());
	}

	@Override
	public Stage getStageById(Integer id) {
		return this.stageRepository.findOne(id);
	}

	@Override
	public Stage updateStage(Stage Stage) {
		return this.stageRepository.save(Stage);
	}

	@Override
	public void deleteStage(int id) {
		this.stageRepository.delete(id);
	}

	@Override
	public void deleteStages() {
		this.stageRepository.deleteAll();
	}

}
