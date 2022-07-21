package lista08_Matrizes;

import java.util.Scanner;

public class Lista8Q02_M3x3ImPares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Entre com o valor na posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
				if (matriz[i][j] % 2 == 0 && matriz[i][j] != 0) {
					par++;
				} else if (matriz[i][j] != 0) {
					impar++;
				}
			}
		}
		System.out.println("");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(matriz[i][j] + "\t");
			}
				System.out.println("");
		}
		
		System.out.println("\n" + "A matriz tem " + par + " número(s) par(es) e " + impar + " número(s) ímpar(es).");

		leia.close();

	}

}
