import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void priceCaculator(){
        Scanner sc = new Scanner(System.in);

        double qtd = 0.0;

        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = sc.nextDouble();

        int _codigo = sc.nextInt();
        int _quantidade = sc.nextInt();
        double _preco = sc.nextDouble();

        qtd = quantidade * preco + _quantidade * _preco;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", qtd);
            
        
    }
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        priceCaculator();

        


 
    }
 
}