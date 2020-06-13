package com.serpamedeiros;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Pessoal {
	public String bi;
	@Getter @Setter
	public String name;
	public int dob;
	public boolean male;
}
