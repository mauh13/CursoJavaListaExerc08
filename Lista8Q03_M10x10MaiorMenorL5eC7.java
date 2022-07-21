package lista08_Matrizes;

import java.util.Random;

public class Lista8Q03_M10x10MaiorMenorL5eC7 {

	public static void main(String[] args) {
		Random numAle = new Random();
		
		int matriz [][] = new int [10][10];
		int maiorl = Integer.MIN_VALUE;
		int menorl = Integer.MAX_VALUE;
		int maiorc = Integer.MIN_VALUE;
		int menorc = Integer.MAX_VALUE;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numAle.nextInt(10);
				System.out.printf(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[5][j]>maiorl) {
					maiorl=matriz[5][j];
				}
				if(matriz[5][j]<menorl) {
					menorl=matriz[5][j];
				}
				if(matriz[i][7]>maiorc) {
					maiorc=matriz[i][7];
				}
				if(matriz[i][7]<menorc) {
					menorc=matriz[i][7];
				}
				
			}
		}
		
		System.out.println("\n" + "Na linha 5 o maior valor é " + maiorl + " e o menor é " + menorl + "\n" + "Na coluna 7 o maior valor é " + maiorc + " e o menor é " + menorc);
				
	}

}
