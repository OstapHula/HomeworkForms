package ua.spring.web.entity.enums;

public enum PersonRank {
	FINISH_COURSES("FINISH_COURSES"), JUNIOR("JUNIOR"), MIDDLE("MIDDLE"), SENIOR("SENIOR");
	
	private String rank;

	private PersonRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}
	
}
