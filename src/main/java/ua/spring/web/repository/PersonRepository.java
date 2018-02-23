package ua.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.spring.web.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
