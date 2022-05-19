package br.com.glandata;

public class Decisao {

	/**
	 * Esta classe e responsavel por executar o programa principal e mostra as
	 * opcoes de condicao com if
	 * 
	 * @param args recebe os argumentos de execucao
	 */
	public static void main(String[] args) {

		int primeiraNota = 1;
		int segundaNota = 6;

		// Condicao SE menor que
		if (primeiraNota < segundaNota) {
			System.out.println("Segunda nota é maior");
		} else {
			System.out.println("Primeira nota é maior");
		}

		// Condicao SE igual
		if (primeiraNota == segundaNota) {
			System.out.println("É igual");
		} else {
			System.out.println("É diferente");
		}

		// Condicao SE diferente
		if (primeiraNota != segundaNota) {
			System.out.println("É diferente");
		} else {
			System.out.println("É igual");
		}

		// Condicao com negacao
		if (!(primeiraNota > segundaNota)) {
			System.out.println("Primeira nota não é maior que a segunda nota");
		} else {
			System.out.println("Segunda nota não é maior que a primeira nota");
		}

		// Condicao com E
		if ((primeiraNota > 1) && (segundaNota > 1)) {
			System.out.println("Valor positivo");
		} else {
			System.out.println("Valor negativo");
		}

		// Condicao com OU
		if ((primeiraNota == 1) || (segundaNota == 1)) {
			System.out.println("Um dos valores é igual a 1");
		} else {
			System.out.println("Não tem valor igual a 1");
		}

		int hora = 15;

		if (hora < 10) {
			System.out.println("Bom dia!");
		} else if (hora < 20) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		int idade = 50;

		// Operador ternario
		System.out.println(idade < 18 ? "Não pode dirigir" : "Pode dirigir");

		String texto = idade < 18 ? "Não pode dirigir" : "Pode dirigir";
		System.out.println(texto);

		// Retorno unico em uma unica linha
		if (idade >= 50)
			System.out.println("Você já faz parte da velha guarda");

	}

}
