package controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Stagiaire;

@RestController
public class StagiaireController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/stagiaire")
	public Stagiaire greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Stagiaire(counter.incrementAndGet(), String.format(template, name));

	}
}
