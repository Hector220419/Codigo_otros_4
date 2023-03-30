package exercises;

import java.util.Scanner;

public class CodigoOtros4 {
	public static void main(String[] args) { // Se colocan dentro del metodo main
		Scanner s = new Scanner(System.in); // Se agrega el System.in de scanner
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine().toLowerCase(); // Se valida que introduzca mayusculas

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		Scanner s2 = new Scanner(System.in); // Se coloca el System.in de scanner
		String j2 = s2.nextLine().toLowerCase();

		if (j1.equals(j2)) { // Se elimina un parentesis extra
			System.out.println("Empate");
		} else {

			int g = 2;

			switch (j1) {

			case "piedra": {
				if (j2.equals("tijeras")) { // Se cambia la sentencia a equals
					g = 1;
				}
				System.out.println("Gana el jugador " + g);
				break; // Se agregan los break correspondientes
			}
			
			case "papel": { // papel
				if (j2.equals("piedra")) { // Se cambia la sentencia a equals
					g = 1;
				}
				System.out.println("Gana el jugador " + g);
				break;
			}

			case "tijeras": { // tijeras
				if (j2.equals("papel")) { // Se cambia la sentencia a equals
					g = 1;
				}
				System.out.println("Gana el jugador " + g);
				break;
			}

			// En este caso el default no funciona como tal, ya que en cualquier caso se ingresa a las opciones "piedra, papel o tijeras"
		}

	}
		
		s.close();
		s2.close(); // Se cierran ambos scanner
	}
} // Se corrigieron los corchetes de final e inicio