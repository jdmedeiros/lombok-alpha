package com.serpamedeiros;

import lombok.Data;

public @Data class Person {

	public String bi;
	public String name;
	public int dob;
	public boolean male;

	public Person(String bi, String name, int dob, boolean male) {
		this.bi = bi;
		this.name = name;
		this.dob = dob;
		this.male = male;
	}
}