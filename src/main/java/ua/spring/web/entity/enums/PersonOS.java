package ua.spring.web.entity.enums;

public enum PersonOS {
	WINDOWS("WINDOWS"), MAC_OS("MAC_OS"), LINUX("MAC_OS");
	
	private String os;

	private PersonOS(String os) {
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
}
