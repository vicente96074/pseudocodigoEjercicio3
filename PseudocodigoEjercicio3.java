import java.util.Scanner;

public class PseudocodigoEjercicio3{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		int factorial = 1;
		
		
		System.out.print("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		for(int i = 1; i<=numero; i++){
			factorial = factorial*i;
		}
		
		System.out.println(numero + "! es: " + factorial);
		
	}
	
	
}
