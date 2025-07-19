package herencia;

import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
//        Profesor profesor1 = new Profesor("George", "Maxi", "gmaxi@gmail.com", 10000);

        Persona persona1 = new Alumno("George", "Maxi", "gmaxi@gmail.com", 17);

        Persona persona2 = new Profesor("Sheyla", "Rodriguez", "srodriguez@gmail.com", 10000);

        Persona persona3 = new Persona("Jose", "Beltran", "jbeltran@gmail.com");

        Persona persona4 = new Admin("Juan", "Ramirez", "jruamirez@gmail.com", "Ejecutivo");

        persona1.imprimir();


        System.out.println("Persona 1"); // Alumno
        persona1.imprimir();
        System.out.println();

        System.out.println("Persona 2"); // Profesor
        persona2.imprimir();
        System.out.println();

        System.out.println("Persona 3"); // Persona
        persona3.imprimir();
        System.out.println();

        System.out.println("Persona 4");
        persona4.imprimir();


    }
}
