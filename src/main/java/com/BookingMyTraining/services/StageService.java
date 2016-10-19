package com.BookingMyTraining.services;

import java.util.Collection;

import com.BookingMyTraining.domain.Stage;

public interface StageService {

	Collection<Stage> listAllStages();

	Stage getStageById(Integer id);

	Stage updateStage(Stage Stage);

	void deleteStage(int id);

	void deleteStages();

}
