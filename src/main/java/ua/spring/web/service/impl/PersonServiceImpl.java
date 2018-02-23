package ua.spring.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.spring.web.entity.Person;
import ua.spring.web.repository.PersonRepository;
import ua.spring.web.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	private PersonRepository personRepository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void savePerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public List<Person> findAllPersons() {
		return personRepository.findAll();
	}

}
