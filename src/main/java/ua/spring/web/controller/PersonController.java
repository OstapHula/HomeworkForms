package ua.spring.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.spring.web.entity.Person;
import ua.spring.web.entity.enums.PersonCountry;
import ua.spring.web.entity.enums.PersonEducation;
import ua.spring.web.entity.enums.PersonOS;
import ua.spring.web.entity.enums.PersonRank;
import ua.spring.web.entity.enums.PersonTechnology;
import ua.spring.web.service.PersonService;

@Controller
@SessionAttributes("person")
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/add")
	public String showAddForm(Model model){
		
		LinkedHashSet<PersonCountry> countryOptions = new LinkedHashSet<>();
		countryOptions.addAll(Arrays.asList(PersonCountry.values()));
		
		ArrayList<Integer> ageOptions = new ArrayList<>();
		for (int i = 15; i <= 60; i++) {
			ageOptions.add(i);
		}
		
		ArrayList<PersonEducation> educationOptions = new ArrayList<>();
		educationOptions.addAll(Arrays.asList(PersonEducation.values()));
		
		List<String> socialOptions = new ArrayList<>();
		socialOptions.add("INSTAGRAM");
		socialOptions.add("FASEBOOK");
		socialOptions.add("TWITTER");
		socialOptions.add("VK");
		socialOptions.add("GOOGLE_PLUS");
		
		List<PersonOS> osOptions = new ArrayList<>();
		osOptions.addAll(Arrays.asList(PersonOS.values()));
		
		List<PersonRank> rankOptions = new ArrayList<>();
		rankOptions.addAll(Arrays.asList(PersonRank.values()));
		
		List<PersonTechnology> technologyOptions = new ArrayList<>();
		technologyOptions.addAll(Arrays.asList(PersonTechnology.values()));

		
		model.addAttribute("technologyList", technologyOptions);
		model.addAttribute("rankList", rankOptions);
		model.addAttribute("osList", osOptions);
		model.addAttribute("socialList", socialOptions);
		model.addAttribute("educationList", educationOptions);
		model.addAttribute("ageList", ageOptions);
		model.addAttribute("countryList", countryOptions);
		model.addAttribute("personModel", new Person());
		return "person/add";
	}
	
	@PostMapping("/add")
	public String savePerson(@ModelAttribute("personModel") Person person){
		personService.savePerson(person);
		return "redirect:/person/list";
	}
	
	@GetMapping("/list")
	public String showListPage(Model model){
		model.addAttribute("personList", personService.findAllPersons());
		return "person/list";
	}
	
}
