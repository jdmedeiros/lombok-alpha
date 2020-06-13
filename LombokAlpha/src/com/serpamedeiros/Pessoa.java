package com.serpamedeiros;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public @Data class Pessoa {
	public String bi;
	public String name;
	public int dob;
	public boolean male;
}
