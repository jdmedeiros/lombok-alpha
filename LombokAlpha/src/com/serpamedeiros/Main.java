package com.serpamedeiros;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("06278442", "John Smith", 1962, true);
		System.out.println(person.toString());
		person.setBi("208451447");
		System.out.println(person.toString());

		Pessoa pessoa = new Pessoa("06278442", "James Wilson", 2002, true);
		System.out.println(pessoa.toString());
		pessoa.setBi("208451447");
		System.out.println(pessoa.toString());

		Pessoal pessoal = new Pessoal("06278442", "Jane Smith", 1999, false);
		System.out.println(pessoal.getName());
		pessoal.setName("Mary Jane Smith");
		System.out.println(pessoal.getName());
	}

}
