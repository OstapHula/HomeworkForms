package ua.spring.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.spring.web.entity.enums.PersonCountry;
import ua.spring.web.entity.enums.PersonEducation;
import ua.spring.web.entity.enums.PersonRank;
import ua.spring.web.entity.enums.PersonSex;

@Entity
@Table(name="person")
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity{
	
	@Column(name="full_name", length=255)
	private String fullName;
	
	@Max(60)
	@Min(15)
	private int age;
	
	@Enumerated(EnumType.STRING)
	private PersonCountry country;
	
	@Enumerated(EnumType.STRING)
	private PersonSex sex;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private PersonEducation education;
	
	private String[] social;
	
	@Column(name="favorive_lenguage")
	private String favoriveLenguage;
	
	private String[] os;
	
	private String experience;
	
	@Enumerated(EnumType.STRING)
	private PersonRank rank;
	
	private String[] technology;
	
	@Column(name="find_our_survey")
	private String findOurSurvey;
	
}
