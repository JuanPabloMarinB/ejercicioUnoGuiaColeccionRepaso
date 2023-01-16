//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//        salir, se mostrará todos los perros guardados en el ArrayList.

package Servicios;

import Entidades.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPerro {

    ArrayList<String> arrayRazas = new ArrayList<>();

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Perro p1 = new Perro();

    public void agregarPerro() {

        String resp;
        boolean salir = false;

        System.out.println("¿Cuál es el nombre de tu perrito?");
        p1.setNombre(sc.next());
        System.out.println("¿De qué raza es " + p1.getNombre() + "?");
        p1.setRaza(sc.next());
        arrayRazas.add(p1.getNombre());
        arrayRazas.add(p1.getRaza());


        do {
            System.out.println("¿Quieres agregar otro perrito? S/N");
            resp = sc.next();

            while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("Respuesta incorrecta, marca S o N");
                resp = sc.next();
            }
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("¿Cuál es el nombre de tu perrito?");
                p1.setNombre(sc.next());
                System.out.println("¿De qué raza es " + p1.getNombre() + "?");
                p1.setRaza(sc.next());
                arrayRazas.add(p1.getNombre());
                arrayRazas.add(p1.getRaza());
            } else {
                salir = true;
            }

        } while (!salir);
        
        System.out.println("Las razas agregadas fueron: \n");

        for (String aux : arrayRazas) {
            System.out.println(aux);
        }


    }


}
