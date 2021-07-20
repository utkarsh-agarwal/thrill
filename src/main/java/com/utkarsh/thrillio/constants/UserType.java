package com.utkarsh.thrillio.constants;

public enum UserType {

	USER(0), EDITOR(1), CHIEF_EDITOR(2);

	private UserType(int name) {
		this.name = name;
	}

	private int name;

	public int getName() {
		return name;
	}

}