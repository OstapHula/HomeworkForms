package ua.spring.web.entity.enums;

public enum PersonEducation {
	BACHELOR("BACHELOR"), MASTER("MASTER"), JUNIOR_SPECIALIST("JUNIOR_SPECIALIST");
	
	private String education;

	private PersonEducation(String education) {
		this.education = education;
	}

	public String getEducation() {
		return education;
	}

}
