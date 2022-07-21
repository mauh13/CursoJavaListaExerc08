package lista08_Matrizes;

import java.util.Random;

public class Lista8Q01_M4x4Aleatorio09 {

	public static void main(String[] args) {
	Random numAle = new Random();
		
	int matriz [][] = new int [4][4];
	int maior = 0;
	int linha = 0;
	int coluna = 0;
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			matriz[i][j] = numAle.nextInt(10);
			if (matriz[i][j] > maior) {
				maior = matriz[i][j];
				linha = i;
				coluna = j;
			}
		}
	}
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.printf(matriz[i][j] + "\t");
		}
			System.out.println("");
	}
	
	System.out.println("\n" + "Maior valor da matriz é: " + maior + ", na linha: " + linha +  ", coluna: " + coluna);
	
	}

}
