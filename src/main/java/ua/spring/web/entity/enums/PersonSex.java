package ua.spring.web.entity.enums;

public enum PersonSex {
	MAIL("MAIL"), FEMAIL("FEMAIL");
	
	private String sex;

	private PersonSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

}
