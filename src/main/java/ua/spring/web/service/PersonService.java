package ua.spring.web.service;

import java.util.List;

import ua.spring.web.entity.Person;

public interface PersonService {
	
	void savePerson(Person person);
	
	List<Person> findAllPersons(); 
}
