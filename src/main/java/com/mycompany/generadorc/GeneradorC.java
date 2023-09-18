
package com.mycompany.generadorc;
import java.util.Random;
public class GeneradorC {
    public static void main(String[] args) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
        int longitud = 10;
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contrasena.append(caracter);
        }
        System.out.println("Contraseña generada: " + contrasena.toString());
    }
}

    

