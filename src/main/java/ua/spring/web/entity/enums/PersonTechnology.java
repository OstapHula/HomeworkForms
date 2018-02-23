package ua.spring.web.entity.enums;

public enum PersonTechnology {
	 MYSQL("MYSQL"), JDBC("JDBC"), HIBERNATE("HIBERNATE"), HTML("HTML"), CSS("CSS");
	 
	 private String technology ;

	private PersonTechnology(String technology) {
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}
	 
}
