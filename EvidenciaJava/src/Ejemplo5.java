import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cantidadNumeros = scanner.nextInt();

      
        int[] numeros = new int[cantidadNumeros];

        
        System.out.println("Ingrese los números:");

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numeros[i]);
        }
    }
	
}