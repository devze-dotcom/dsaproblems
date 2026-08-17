package Beencrowd.Beginner.Sphere;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static double sphereVolume(double radius){
        final Double PI_VALUE = 3.14159;
        return (4.0/3) * PI_VALUE * Math.pow(radius, 3);
    }
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();
        double area = sphereVolume(value);

        System.out.printf("VOLUME = %.3f%n", area);


 
    }
 
}