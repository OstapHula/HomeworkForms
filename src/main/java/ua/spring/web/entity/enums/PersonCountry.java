package ua.spring.web.entity.enums;

public enum PersonCountry {
	UNITED_STATES("UNITED_STATES"), 
	UNITED_KINGDOM("UNITED_KINGDOM"),
	FRANCE("FRANCE"),
	CHINA("CHINA"),
	JAPAN("JAPAN"),
	GERMANY("GERMANY"),
	RUSSIA("RUSSIA"),
	AUSTRALIA("AUSTRALIA"),
	ITALY("ITALY"),
	INDIA("INDIA"),
	MOLDOVA("MOLDOVA"),
	CANADA("CANADA"),
	SPAIN("SPAIN"),
	BRAZIL("BRAZIL"),
	UKRAINE("UKRAINE"),
	OTHER("OTHER");
	
	private String country;

	private PersonCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
	
}
