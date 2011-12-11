package net.antoniy.gidder.fragment;

public enum FragmentType {
	
	USERS("Users"),
	REPOSITORIES("Repositories");
	
	private String title;

	private FragmentType(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
