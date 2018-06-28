package com.bridgelabz.AnnotPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}
@Autowired
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
