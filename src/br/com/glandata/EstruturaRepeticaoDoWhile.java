package br.com.glandata;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {

		int idade = 15;

		do {
			System.out.println("Você não pode dirigir");
			idade++;
		} while (idade < 18);

	}

}
